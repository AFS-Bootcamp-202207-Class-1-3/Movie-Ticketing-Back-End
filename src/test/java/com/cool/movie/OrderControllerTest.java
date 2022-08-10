package com.cool.movie;

import com.cool.movie.dto.order.OrderForPairRequest;
import com.cool.movie.dto.order.OrderRequest;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

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

        orderService.save(new OrderForPairRequest("1","1","122","1","2"));
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


    @Test
    public void should_return_orderListResponses_when_get_getOrderList_given_userId_startPage_pageSize() throws Exception {
        //given
        String userId = "1";
        Integer pageNumber = 1;
        Integer pageSize = 5;
        //when then
        mockMvc.perform(MockMvcRequestBuilders.get("/order/getOrderList?pageSize={pageSize}&pageNumber={pageNumber}&userId={userId}",pageSize,pageNumber, userId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.pageSize").value("5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.pageNumber").value("1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.totalPages").value("2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.totalOrders").value("10"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.ordersCount").value("5"));
    }

}
