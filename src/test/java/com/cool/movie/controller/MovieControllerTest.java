package com.cool.movie.controller;

import com.cool.movie.entity.Movie;
import com.cool.movie.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Date;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class MovieControllerTest {
    @Autowired
    private MockMvc client;
    @Autowired
    private MovieRepository movieRepository;


    @Test
    void should_return_selected_movie_when_call_get_api_given_movie_id() throws Exception {
        //given
        Movie movie = movieRepository.save(new Movie("gege", "my_movie", "this is my movie",
                new Date(), 99, "action", "postUrl"));

        //when & then
        client.perform(MockMvcRequestBuilders.get("/movie/{id}", movie.getId()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("my_movie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.introduction").value("this is my movie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.duration").value(99))
                .andExpect(MockMvcResultMatchers.jsonPath("$.types").value("action"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.postUrl").value("postUrl"));
    }
}
