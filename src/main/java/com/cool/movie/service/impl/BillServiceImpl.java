package com.cool.movie.service.impl;

import com.cool.movie.dto.BillResponse;
import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.repository.MovieRepository;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.repository.UserRepository;
import com.cool.movie.service.BillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BillServiceImpl implements BillService {

    @Resource
    OrderRepository orderRepository;

    @Resource
    MovieRepository movieRepository;


    @Resource
    UserRepository userRepository;

    @Override
    public BillResponse getBill(String orderId) {
//        CustomerOrder customerOrder = orderRepository.findById(orderId).orElseThrow();
        return null;
    }
}
