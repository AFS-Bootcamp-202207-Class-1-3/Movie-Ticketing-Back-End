package com.cool.movie.controller;

import com.cool.movie.entity.Pay;
import com.cool.movie.repository.PayRepository;
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
public class PayControllerTest {
    @Autowired
    private MockMvc client;
    @Autowired
    private PayRepository payRepository;


    @Test
    void should_return_updated_pay_when_call_put_update_api_given_pay() throws Exception {
        //given
        Pay pay = new Pay();
        pay.setId("123");
        pay.setTotalPrice(100.0);
        pay.setStatus(0);
        pay.setOrdersIds("george_order");
        Pay savePay = payRepository.save(pay);

        String requestString = new ObjectMapper().writeValueAsString(savePay);

        //when & then
        client.perform(MockMvcRequestBuilders.put("/pay")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ordersIds").value("george_order"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.totalPrice").value(100.0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.status").value(1));
    }
}
