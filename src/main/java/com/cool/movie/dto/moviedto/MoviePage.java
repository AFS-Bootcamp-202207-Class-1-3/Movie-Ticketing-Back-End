package com.cool.movie.dto.moviedto;


import java.util.List;

/**
 * MoviePage
 * 电影的分页封装
 */
public class MoviePage {
    private Integer pageSize;
    private Integer pageNumber;
    private Integer totalPages;
    private Integer currentPage;
    private List<MovieResponse> movieResponses;

    public MoviePage(Integer pageSize, Integer pageNumber, Integer totalPages, Integer currentPage, List<MovieResponse> movieResponses) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.movieResponses = movieResponses;
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

    public List<MovieResponse> getMovieResponses() {
        return movieResponses;
    }

    public void setMovieResponses(List<MovieResponse> movieResponses) {
        this.movieResponses = movieResponses;
    }
}
