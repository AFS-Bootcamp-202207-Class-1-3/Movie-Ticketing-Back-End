package com.cool.movie.controller;


import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping
    public void selectAll(CustomerOrder customerOrder) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody CustomerOrder customerOrder) {

    }


    @PutMapping
    public void update(@RequestBody CustomerOrder customerOrder) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

