package com.cool.movie;

import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Collections;

import static org.hamcrest.Matchers.hasSize;


@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class OrderControllerTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_not_found_when_get_order_given_invalid_order_id() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/order/sssssssss"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }


//    @Test
//    public void should_return_customer_order_when_getSameViewingTime_given_orderRequest() throws Exception{
//        //given
//        String orderRequest = "    {\n" +
//                "        \"userId\": \"1\",\n" +
//                "        \"cinemaId\": \"10\",\n" +
//                "        \"movieScheduleId\": \"11\"\n" +
//                "    }";
//        //when &then
//        mockMvc.perform(MockMvcRequestBuilders.get("/order/viewingTime")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(orderRequest))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$").value("false"));
//    }

}
