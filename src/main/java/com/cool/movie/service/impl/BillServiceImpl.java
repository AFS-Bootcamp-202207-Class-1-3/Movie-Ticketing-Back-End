package com.cool.movie.service.impl;

import com.cool.movie.dto.BillResponse;
import com.cool.movie.entity.*;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.mapper.BillMapper;
import com.cool.movie.repository.BillRepository;
import com.cool.movie.service.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BillServiceImpl implements BillService {

    @Resource
    BillRepository billRepository;
    @Resource
    BillMapper billMapper;



    @Override
    public BillResponse getBill(String orderId) {
        Bill bill = billRepository.findById(orderId).orElseThrow(() -> new NotFoundException(Bill.class.getSimpleName()));
        return billMapper.toResponse(bill);
    }
}
