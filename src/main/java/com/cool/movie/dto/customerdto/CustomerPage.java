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
}
