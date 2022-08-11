package com.cool.movie.dto.movie;


import lombok.Data;

@Data
public class MovieWithMessagePage extends MoviePage{

    // 搜索信息
    private String searchMessage;
}
