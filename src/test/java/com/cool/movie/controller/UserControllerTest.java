package com.cool.movie.controller;

import com.cool.movie.dto.LoginRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class UserControllerTest {
    @Autowired
    MockMvc client;

    @Test
    void should_return_success_response_when_call_post_login_api_given_right_login_password() throws Exception {
        //given
        String requestString = new ObjectMapper().writeValueAsString(new LoginRequest("name-1", "123456"));

        //when & then
        client.perform(MockMvcRequestBuilders.post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("success"));
    }

    @Test
    void should_return_fail_response_when_call_post_login_api_given_wrong_login_password() throws Exception {
        //given
        String requestString = new ObjectMapper().writeValueAsString(new LoginRequest("name-1", "12345"));

        //when & then
        client.perform(MockMvcRequestBuilders.post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(500))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("fail"));
    }

    @Test
    void should_return_validate_fail_response_when_call_post_login_api_given_wrong_login_parameter() throws Exception {
        //given
        String requestString = new ObjectMapper().writeValueAsString(new LoginRequest());

        //when & then
        client.perform(MockMvcRequestBuilders.post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(404))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("parameter error"));
    }
}
