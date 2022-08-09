package com.cool.movie.controller;


import com.cool.movie.dto.OrderDetailResponse;
import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.Customer;
import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.entity.Movie;
import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.mapper.OrderDetailMapper;
import com.cool.movie.service.MovieScheduleService;
import com.cool.movie.service.MovieService;
import com.cool.movie.service.OrderService;
import com.cool.movie.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @Resource
    private MovieService movieService;

    @Resource
    private UserService userService;

    @Resource
    private MovieScheduleService movieScheduleService;

    @GetMapping
    public void selectAll(CustomerOrder customerOrder) {

    }


    @GetMapping("{id}")
    public OrderDetailResponse selectOne(@PathVariable Serializable id) {
        CustomerOrder customerOrder = orderService.findById(String.valueOf(id));
        Customer customer = userService.findById(customerOrder.getUserId());
        Movie movie = movieService.findById(customerOrder.getMovieId());
        MovieSchedule movieSchedule = movieScheduleService.findById(customerOrder.getMovieScheduleId());
        OrderDetailMapper orderDetailMapper = new OrderDetailMapper();
        return orderDetailMapper.toResponse(customerOrder, customer, movie, movieSchedule);
    }


    @PostMapping
    public CustomerOrder insert(@RequestBody OrderRequest request) {
        return orderService.save(request);
    }


    @PutMapping
    public void update(@RequestBody CustomerOrder customerOrder) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

