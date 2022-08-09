package com.cool.movie.mapper;


import com.cool.movie.dto.moviedto.MovieResponse;
import com.cool.movie.entity.Movie;
import com.cool.movie.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {
    public List<MovieResponse> toResponses(List<Movie> movies){
        ArrayList<MovieResponse> movieResponses = new ArrayList<>();
        movies.stream().forEach((movie -> {
            com.cool.movie.dto.moviedto.MovieResponse movieResponse = new com.cool.movie.dto.moviedto.MovieResponse();
            BeanUtils.copyProperties(movie, movieResponse);
            movieResponse.setReleaseTime(MessageFormat.format("{0}", DateUtils.dateFormat(movie.getReleaseTime())));
            movieResponses.add(movieResponse);
        }));
        return movieResponses;
    }
}
