package com.cool.movie.controller;
import com.cool.movie.dto.order.OrderDetailResponse;
import com.cool.movie.dto.order.OrderForPairRequest;
import com.cool.movie.dto.order.OrderListResponse;
import com.cool.movie.dto.order.OrderRequest;
import com.cool.movie.dto.orderdto.OrderPage;
import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.persistence.NonUniqueResultException;
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
    public CustomerOrder insert(@RequestBody OrderForPairRequest request) {
        return orderService.save(request);
    }


    @PutMapping
    public void update(@RequestBody CustomerOrder customerOrder) {

    }

    @PostMapping("/viewingTime")
    public Boolean isExistSameViewingTime(@RequestBody OrderRequest orderRequest){
        CustomerOrder sameViewingTime = orderService.getSameViewingTime(orderRequest);
        try{
            if (sameViewingTime==null||sameViewingTime.equals("")){
                return false;
            }else{
                return true;
            }
        }catch (NonUniqueResultException e){
            return true;
        }
    }

    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }

    @GetMapping(value = "/getOrderList", params = {"pageSize", "pageNumber", "userId"})
    public OrderPage selectByPage(@RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize
            , @RequestParam(value = "pageNumber", defaultValue = "5", required = false) Integer pageNumber
            , @RequestParam(value = "userId") String userId) {
        return orderService.findSingleByPage(pageSize, pageNumber, userId);
    }

}

