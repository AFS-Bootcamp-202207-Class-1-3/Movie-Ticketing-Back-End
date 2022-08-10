package com.cool.movie.controller;


import com.cool.movie.dto.LoginRequest;
import com.cool.movie.dto.LoginResponse;
import com.cool.movie.dto.customerdto.CustomerPage;
import com.cool.movie.entity.Customer;
import com.cool.movie.enums.LoginCode;
import com.cool.movie.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(params = {"pageSize", "pageNumber"})
    public CustomerPage selectByPage(@RequestParam(value = "pageSize", defaultValue = "1", required = false) Integer pageSize
            , @RequestParam(value = "pageNumber", defaultValue = "6", required = false) Integer pageNumber) {
        return userService.findByPage(pageSize, pageNumber);
    }


    @GetMapping
    public void selectAll(Customer customer) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody Customer customer) {

    }


    @PutMapping
    public void update(@RequestBody Customer customer) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }

    @PostMapping(path = "/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        Customer customer = userService.findByRealName(request.getRealName());
        return userService.login(request)
                ? new LoginResponse(LoginCode.SUCCESS.getCode(), LoginCode.SUCCESS.getMessage(), customer.getId(),
                customer.getRealName(), customer.getNickName(), customer.getAvatarUrl(), customer.getAge(),
                customer.getGender(), customer.getPhoneNumber(), customer.getCity(), customer.getIntroduction())
                :  new LoginResponse(LoginCode.FAILED.getCode(), LoginCode.FAILED.getMessage());
    }
}

