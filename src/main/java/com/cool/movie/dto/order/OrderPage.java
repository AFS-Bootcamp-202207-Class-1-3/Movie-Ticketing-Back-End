package com.cool.movie.dto.order;

import com.cool.movie.dto.order.OrderListResponse;
import lombok.Data;

import java.util.List;

@Data
public class OrderPage {
    private Integer pageSize;

    private Integer pageNumber;

    private Integer totalPages;

    private Integer totalOrders;

    private Integer ordersCount;

    private List<OrderListResponse> orderListResponses;

    public OrderPage(Integer pageSize, Integer pageNumber, int totalPages, int totalOrders, int ordersCount, List<OrderListResponse> orderListResponses) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalOrders = totalOrders;
        this.ordersCount = ordersCount;
        this.orderListResponses = orderListResponses;
    }
}
