package com.cool.movie.controller;

import com.cool.movie.dto.login.LoginRequest;
import com.cool.movie.entity.Customer;
import com.cool.movie.repository.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    @Test
    void should_return_success_response_when_call_post_login_api_given_right_login_password() throws Exception {
        //given
        String requestString = new ObjectMapper().writeValueAsString(new LoginRequest("吴彦祖", "111111"));
        Customer customer = userRepository.findByRealName("吴彦祖");

        //when & then
        client.perform(MockMvcRequestBuilders.post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("success"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.userId").value(customer.getId()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.nickName").value(customer.getNickName()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.realName").value(customer.getRealName()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.city").value(customer.getCity()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.avatarUrl").value(customer.getAvatarUrl()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.age").value(customer.getAge()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.introduction").value(customer.getIntroduction()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.gender").value(customer.getGender()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phoneNumber").value(customer.getPhoneNumber()));
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

//    @Test
//    void should_return_single_partner_by_page_when_get_given_userId_movieScheduleId_pageSize_pageNumber()throws Exception{
//
//        // given
//        int pageSize=4;
//        int pageNumber=1;
//        int userId=1;
//        int movieScheduleId=1;
//
//        int exceptPageSize=pageSize;
//        int exceptPageNumber=pageNumber;
//        int exceptTotalPages=3;
//        int exceptTotalCustomers=9;
//        int exceptCustomersCount=4;
//
//        // then
//        client.perform(MockMvcRequestBuilders.get("/user?pageSize={pageSize}&pageNumber={pageNumber}" +
//                        "&userId={userId}&movieScheduleId={movieScheduleId}", pageSize, pageNumber,userId,movieScheduleId))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.pageSize").value(exceptPageSize))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.pageNumber").value(exceptPageNumber))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.totalPages").value(3))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.totalCustomers").value(exceptTotalCustomers))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerCount").value(exceptCustomersCount))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].id").value("2"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].realName").value("name-2"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].nickName").value("nickname-2"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].avatarUrl").value("https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].age").value("18"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[1].gender").value("male"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[0].phoneNumber").value("13249555111"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[1].city").value("珠海"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.customerResponses[1].introduction").value("I am id-3"));
//    }
}
