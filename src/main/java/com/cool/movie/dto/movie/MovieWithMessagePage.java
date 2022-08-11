package com.cool.movie.dto.movie;


import lombok.Data;

import java.util.List;

@Data
public class MovieWithMessagePage extends MoviePage{

    // 搜索信息
    private String searchMessage;

    public MovieWithMessagePage(Integer pageSize, Integer pageNumber, Integer totalPages, Integer totalMovies, Integer moviesCount, List<MovieResponse> movieResponses, String searchMessage) {
        super(pageSize, pageNumber, totalPages, totalMovies, moviesCount, movieResponses);
        this.searchMessage = searchMessage;
    }

    public MovieWithMessagePage(String searchMessage) {
        this.searchMessage = searchMessage;
    }
}
