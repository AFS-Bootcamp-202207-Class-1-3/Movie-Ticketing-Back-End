package com.cool.movie;

import com.cool.movie.dto.OrderListResponse;
import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
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
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.hasSize;


@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderService orderService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_not_found_when_get_order_given_invalid_order_id() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/order/sssssssss"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void should_return_bool_when_get_viewingTime_given_orderRequest() throws Exception {

        orderService.save(new OrderRequest("1","1","122","1"));
        String newCustomerOrder = "    {\n" +
                "        \"id\": \"1\",\n" +
                "        \"userId\": \"1\",\n" +
                "        \"movieScheduleId\": \"122\",\n" +
                "        \"cinemaId\": \"1\"\n" +
                "    }";
        //when &then
        mockMvc.perform(MockMvcRequestBuilders.post("/order/viewingTime", newCustomerOrder)
                .contentType(MediaType.APPLICATION_JSON)
                .content(newCustomerOrder))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(true));
    }




}
