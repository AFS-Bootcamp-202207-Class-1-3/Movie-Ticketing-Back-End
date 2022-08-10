package com.cool.movie;

import com.cool.movie.repository.CinemaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class CinemaControllerTest {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_all_cinema_when_selectAll_given_null() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/cinema"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.*").value(hasSize(10)));
    }

}
