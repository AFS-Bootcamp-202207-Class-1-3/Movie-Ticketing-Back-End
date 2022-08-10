package com.cool.movie.mapper;


import com.cool.movie.dto.customerdto.CustomerResponse;
import com.cool.movie.entity.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerMapper {

    public List<CustomerResponse> toResponses(List<Customer> customers) {
        ArrayList<CustomerResponse> customerResponses = new ArrayList<>();
        customers.stream().forEach((customer -> {
            customerResponses.add(toResponse(customer));
        }));
        return customerResponses;
    }

    public CustomerResponse toResponse(Customer customer) {
        CustomerResponse customerResponse = new CustomerResponse();
        BeanUtils.copyProperties(customer, customerResponse);
        return customerResponse;
    }
}
