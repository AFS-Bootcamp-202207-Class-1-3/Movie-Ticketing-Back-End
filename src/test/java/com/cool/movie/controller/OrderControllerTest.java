package com.cool.movie.controller;

import com.cool.movie.dto.OrderRequest;
import com.cool.movie.repository.OrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class OrderControllerTest {
    @Autowired
    private MockMvc client;
    @Autowired
    private OrderRepository orderRepository;

    @BeforeEach
    void cleanDB() {
        orderRepository.deleteAll();
    }

    @Test
    void should_return_order_when_call_post_insert_api_given_order_request() throws Exception {
        //given
        OrderRequest request = new OrderRequest();
        request.setMovieId("movieId");
        request.setCinemaId("cinemaId");
        request.setUserId("useId");
        request.setMovieScheduleId("movieScheduleId");

        String requestString = new ObjectMapper().writeValueAsString(request);

        //when & then
        client.perform(MockMvcRequestBuilders.post("/order")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userId").value(request.getUserId()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieId").value(request.getMovieId()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieScheduleId").value(request.getMovieScheduleId()));
    }
}
