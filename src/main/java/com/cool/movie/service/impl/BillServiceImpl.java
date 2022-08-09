package com.cool.movie.service.impl;

import com.cool.movie.dto.BillResponse;
import com.cool.movie.entity.*;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.mapper.BillMapper;
import com.cool.movie.service.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BillServiceImpl implements BillService {

    @Resource
    OrderService orderService;

    @Resource
    MovieScheduleService movieScheduleService;


    @Resource
    MovieService movieService;

    @Resource
    PairService pairService;

    @Resource
    UserService userService;

    @Resource
    BillMapper billMapper;

    @Resource
    CinemaService cinemaService;

    @Override
    public BillResponse getBill(String orderId) {
        CustomerOrder customerOrder = orderService.findById(orderId).get();
        MovieSchedule movieSchedule = movieScheduleService.findById(customerOrder.getMovieScheduleId()).get();
        Cinema cinema = cinemaService.findById(movieSchedule.getCinemaId()).get();
        Movie movie = movieService.findById(customerOrder.getMovieId());
        Pair pair = pairService.findByUserId(customerOrder.getUserId());
        Customer pairCustomer = userService.findById(pair.getId()).get();
        return billMapper.toResponse(customerOrder, movieSchedule, cinema, movie, pairCustomer);
    }
}
