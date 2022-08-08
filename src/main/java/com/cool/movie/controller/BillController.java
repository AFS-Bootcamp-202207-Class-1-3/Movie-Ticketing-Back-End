package com.cool.movie.controller;

import com.cool.movie.dto.BillResponse;
import com.cool.movie.service.BillService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("bills")
@CrossOrigin
public class BillController {
    @Resource
    BillService billService;

    @GetMapping("/{orderId}")
    public BillResponse getBillByOrderId(@PathVariable String orderId) {
        return billService.getBill(orderId);
    }
}
