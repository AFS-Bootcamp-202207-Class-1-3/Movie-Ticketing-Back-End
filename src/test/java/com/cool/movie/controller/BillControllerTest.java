package com.cool.movie.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;


@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class BillControllerTest {

    @Resource
    MockMvc client;


    @Test
    void should_return_BillResponse_when_perform_bills_api_given_orderId() throws Exception {
        // given

        Integer testId = 1;
        client.perform(MockMvcRequestBuilders.get("/bills/{id}", testId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.cinemaName").value("cinema-1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieName").value("movie-1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(500))
                .andExpect(MockMvcResultMatchers.jsonPath("$.ticketCode").value("123456"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerName").value("name-1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerGender").value("male"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerTelephone").value("13249555111"));
        // when  && then
    }
}
