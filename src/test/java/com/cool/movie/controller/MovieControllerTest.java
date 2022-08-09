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

import java.util.ArrayList;
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

    @Test
    void should_return_movie_page_when_get_given_pageSize_and_pageNumber() throws Exception{

        // given
        movieRepository.deleteAll();
        ArrayList<Movie> movies = new ArrayList<>();
        for (int round = 0; round < 10; round++) {
            movies.add(new Movie(round + "", "my_movie", "this is my movie",
                    new Date(), 99, "action", "postUrl"));
        }
        movieRepository.saveAll(movies);
        int pageSize = 6;
        int pageNumber = 1;


        //then
        client.perform(MockMvcRequestBuilders.get("/movie?pageSize={pageSize}&pageNumber={pageNumber}", pageSize, pageNumber))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.pageSize").value(pageSize))
                .andExpect(MockMvcResultMatchers.jsonPath("$.pageNumber").value(pageNumber))
                .andExpect(MockMvcResultMatchers.jsonPath("$.totalPages").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.totalMovies").value(10))
                .andExpect(MockMvcResultMatchers.jsonPath("$.moviesCount").value(6))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[0].id").value("0"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[1].id").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[2].id").value("2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[3].id").value("3"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[4].id").value("4"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[5].id").value("5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[0].name").value("my_movie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[1].introduction").value("this is my movie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[2].duration").value("99"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[3].types").value("action"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieResponses[4].postUrl").value("postUrl"));
    }
}
