package com.cool.movie.controller;

import com.cool.movie.entity.*;
import com.cool.movie.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.util.Date;


@AutoConfigureMockMvc
@SpringBootTest
@ActiveProfiles("test")
public class BillControllerTest {

    @Resource
    MockMvc client;

    @Resource
    OrderRepository orderRepository;

    @Resource
    MovieScheduleRepository movieScheduleRepository;

    @Resource
    MovieRepository movieRepository;

    @Resource
    CinemaRepository cinemaRepository;

    @Resource
    PairRepository pairRepository;

    @Resource
    UserRepository userRepository;



    @Test
    void should_return_BillResponse_when_perform_bills_api_given_orderId() throws Exception {
        String testOrderId = "Customer-id";
        userRepository.save(new Customer("userA-id","name-a","nickname-a","https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png",18,"male","13249555111","珠海","I am id-1", "111111"));
        userRepository.save(new Customer("userB-id","name-b","nickname-b","https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png",18,"male","13249555112","珠海","I am id-1", "111111"));
        cinemaRepository.save(new Cinema("cinema-id","cinema-name","cinema-location"));
        movieRepository.save(new Movie("movie-id","movie-name","movie-introduction",new Date(),120,"https://www.huanghelou.cc/zb_users/upload/2021/06/20210623184340_37163.jpg","科幻"));
        movieScheduleRepository.save(new MovieSchedule("movieSchedule-id","cinema-id","movie-id",new Date(),50,50,100.0,"roomA 1-1"));
        pairRepository.save(new Pair("pair-id","userA-id","userB-id","movieSchedule-id"));
        orderRepository.save(new CustomerOrder(testOrderId,"movie-id",100.0,"cinema-id",false,"movieSchedule-id",false,"123456","userA-id"));
        client.perform(MockMvcRequestBuilders.get("/bills/{id}", testOrderId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.ticketCode").value("123456"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.cinemaName").value("cinema-name"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movieName").value("movie-name"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.room").value("roomA 1-1"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(100.0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerName").value("name-b"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerGender").value("male"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.partnerTelephone").value("13249555112"));
        // when  && then
    }
}
