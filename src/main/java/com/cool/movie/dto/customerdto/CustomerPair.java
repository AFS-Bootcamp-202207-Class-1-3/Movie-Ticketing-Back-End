package com.cool.movie.dto.customerdto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerPair {
    private String userId;
    private String gender;
    private Integer age;
    private String avatarUrl;
    private String nickName;
    private String introduction;
    private Integer status;
}
