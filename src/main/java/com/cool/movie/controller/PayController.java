package com.cool.movie.controller;


import com.cool.movie.entity.Pay;
import com.cool.movie.service.PayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("pay")
public class PayController {

    @Resource
    private PayService payService;


    @GetMapping
    public void selectAll(Pay pay) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody Pay pay) {
        Pay savePay = new Pay(UUID.randomUUID().toString(),pay.getOrdersIds(),pay.getTotalPrice(),pay.getStatus());
        payService.save(savePay);
    }


    @PutMapping
    public Pay update(@RequestBody Pay pay) {
        return payService.update(pay);
    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

