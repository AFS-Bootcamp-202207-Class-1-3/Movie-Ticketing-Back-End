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
        orderService.save(new CustomerOrder("1","1",10.0,false,"1",false,"123456", "1"));
        String newCustomerOrder = "    {\n" +
                "        \"id\": \"1\",\n" +
                "        \"movieId\": \"1\",\n" +
                "        \"price\": \"10.0\",\n" +
                "        \"cinemaId\": \"1111\",\n" +
                "        \"isPay\":\"false\",\n" +
                "        \"movieScheduleId\":\"1\",\n" +
                "        \"hasUsed\": \"false\",\n" +
                "        \"ticketCode\": \"123456\",\n" +
                "        \"userId\": \"1\"\n" +
                "    }";
        //when &then
        mockMvc.perform(MockMvcRequestBuilders.post("/order/viewingTime", newCustomerOrder)
                .contentType(MediaType.APPLICATION_JSON)
                .content(newCustomerOrder))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").value(false));
    }

/*    @Test
    public void testOrder() {
        orderService.save(new CustomerOrder("1","1",10.0,false,"1",false,"123456", "1"));
        orderService.save(new CustomerOrder("1","1",10.0,false,"1",false,"123456", "1"));
        orderService.save(new CustomerOrder("1","1",10.0,false,"1",false,"123456", "1"));
        orderService.save(new CustomerOrder("1","1",10.0,false,"1",false,"123456", "1"));
        String pageSize = "5";
        String startPage = "1";
        Integer result = (Integer.parseInt(startPage) - 1) * Integer.parseInt(pageSize);
        List<OrderListResponse> orderByUserIdAndByPage = orderRepository.getOrderByUserIdAndByPage("1",pageSize, String.valueOf(result));
        for (OrderListResponse o : orderByUserIdAndByPage) {
            System.out.println("--------------");
            System.out.println(o.getName());
            System.out.println(o.getIsPay());
            System.out.println(o.getId());
            System.out.println(o.getPrice());
            System.out.println(o.getStartTime());
            System.out.println("--------------");
        }
    }*/

    @Test
    public void should_return_orderListResponses_when_get_getOrderList_given_userId_startPage_pageSize() throws Exception {
        //given
        String userId = "1";
        Integer pageSize = 5;
        Integer startPage = 1;
        //when then
        mockMvc.perform(MockMvcRequestBuilders.get("/order/getOrderList?userId={userId}&pageSize={pageSize}&startPage={startPage}", userId,pageSize, startPage))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("10"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("movie-10"));
    }

}
