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
    //1: 未发起匹配; 2: 已发起匹配但未匹配成功 3:匹配成功
    private Integer status;
}
