package com.cool.movie.dto.customerdto;

import lombok.Data;

import java.util.List;

@Data
public class CustomerPage {
    private Integer pageSize;

    private Integer pageNumber;

    private Integer totalPages;

    private Integer totalCustomers;

    private Integer CustomerCount;

    private List<CustomerResponse> customerResponses;

    public CustomerPage(Integer pageSize, Integer pageNumber, Integer totalPages, Integer totalCustomers, Integer customerCount, List<CustomerResponse> customerResponses) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalCustomers = totalCustomers;
        CustomerCount = customerCount;
        this.customerResponses = customerResponses;
    }
}
