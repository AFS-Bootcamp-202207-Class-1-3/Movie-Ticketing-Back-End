package com.cool.movie.controller;


import com.cool.movie.entity.User;
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


    @GetMapping
    public void selectAll(User user) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody User user) {

    }


    @PutMapping
    public void update(@RequestBody User user) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

