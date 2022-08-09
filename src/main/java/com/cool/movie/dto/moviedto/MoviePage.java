package com.cool.movie.dto.moviedto;


import lombok.Data;

import java.util.List;

/**
 * MoviePage
 * 电影的分页封装
 */
@Data
public class MoviePage {
    private Integer pageSize;
    private Integer pageNumber;
    private Integer totalPages;

    private Integer totalMovies;

    private Integer moviesCount;

    private List<MovieResponse> movieResponses;

    public MoviePage(Integer pageSize, Integer pageNumber, Integer totalPages, Integer totalMovies, Integer moviesCount, List<MovieResponse> movieResponses) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalMovies = totalMovies;
        this.moviesCount = moviesCount;
        this.movieResponses = movieResponses;
    }

    public MoviePage() {
    }

    public Integer getPageSize() {
        return pageSize;
    }


}
