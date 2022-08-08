package com.cool.movie;

import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.repository.OrderRepository;
import org.checkerframework.checker.units.qual.A;
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
public class OrderControllerTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_order_info_when_get_order_given_order_id() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/order/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.orderId").value(1));
    }
}
