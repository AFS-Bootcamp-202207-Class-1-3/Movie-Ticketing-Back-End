package com.cool.movie.dto.moviedto;


import com.cool.movie.entity.Movie;

import java.util.List;

/**
 * MoviePage
 * 电影的分页封装
 *
 */
public class MoviePage {
    private Integer pageSize;
    private Integer pageNumber;
    private Integer totalPages;
    private Integer currentPage;
    private List<Movie> movies;

    public MoviePage(Integer pageSize, Integer pageNumber, Integer totalPages, Integer currentPage, List<Movie> movies) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.movies = movies;
    }

    public MoviePage() {
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
