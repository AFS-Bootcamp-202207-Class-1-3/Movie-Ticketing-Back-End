package com.cool.movie.controller;


import com.cool.movie.dto.LoginRequest;
import com.cool.movie.dto.LoginResponse;
import com.cool.movie.entity.Customer;
import com.cool.movie.enums.LoginCode;
import com.cool.movie.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;


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
        if (request.getRealName() == null || request.getPassword() == null) {
            return new LoginResponse(LoginCode.VALIDATE_FAILED.getCode(), LoginCode.VALIDATE_FAILED.getMessage());
        }
        return userService.login(request)
                ? new LoginResponse(LoginCode.SUCCESS.getCode(), LoginCode.SUCCESS.getMessage())
                :  new LoginResponse(LoginCode.FAILED.getCode(), LoginCode.FAILED.getMessage());
    }
}

