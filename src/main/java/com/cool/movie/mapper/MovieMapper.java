package com.cool.movie.mapper;


import com.cool.movie.entity.MovieResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {
    public List<com.cool.movie.dto.moviedto.MovieResponse> toResponses(List<MovieResponse> movies){
        ArrayList<com.cool.movie.dto.moviedto.MovieResponse> movieResponses = new ArrayList<>();
        movies.stream().forEach((movie -> {
            com.cool.movie.dto.moviedto.MovieResponse movieResponse = new com.cool.movie.dto.moviedto.MovieResponse();
            BeanUtils.copyProperties(movie, movieResponse);
            movieResponses.add(movieResponse);
        }));
        return movieResponses;
    }
}
