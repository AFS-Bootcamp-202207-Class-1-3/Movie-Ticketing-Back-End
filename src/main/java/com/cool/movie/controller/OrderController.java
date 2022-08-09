package com.cool.movie.controller;


import com.cool.movie.dto.OrderDetailResponse;
import com.cool.movie.dto.OrderRequest;
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
    public OrderDetailResponse selectOne(@PathVariable Serializable id) {
        return orderService.getOrderDetailResponse(id);
    }


    @PostMapping
    public CustomerOrder insert(@RequestBody OrderRequest request) {
        return orderService.save(request);
    }


    @PutMapping
    public void update(@RequestBody CustomerOrder customerOrder) {

    }

    @PostMapping("/viewingTime")
    public String isExistSameViewingTime(@RequestBody OrderRequest orderRequest){
        CustomerOrder sameViewingTime = orderService.getSameViewingTime(orderRequest);
        CustomerOrder saveCustomerOrder = new CustomerOrder();
        saveCustomerOrder.setCinemaId(orderRequest.getCinemaId());
        saveCustomerOrder.setMovieScheduleId(orderRequest.getMovieScheduleId());
        saveCustomerOrder.setUserId(orderRequest.getUserId());
        saveCustomerOrder.setMovieId(orderRequest.getMovieId());
        if (sameViewingTime==null||sameViewingTime.equals("")){
            CustomerOrder save = orderService.save(saveCustomerOrder);
            return save.getId();
        }else{
            return sameViewingTime.getId();
        }
    }

    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

