package com.cool.movie.mapper;

import com.cool.movie.dto.customerdto.CustomerPair;
import com.cool.movie.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class PairMapper {
    public CustomerPair toResponse(Customer customer,Integer status){
        return CustomerPair.builder()
                .userId(customer.getId())
                .age(customer.getAge())
                .avatarUrl(customer.getAvatarUrl())
                .gender(customer.getGender())
                .nickName(customer.getNickName())
                .introduction(customer.getIntroduction())
                .status(status)
                .build();
    }
}
