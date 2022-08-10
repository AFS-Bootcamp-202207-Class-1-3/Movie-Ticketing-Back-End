package com.cool.movie.mapper;


import com.cool.movie.dto.moviedto.MovieResponse;
import com.cool.movie.entity.Movie;
import com.cool.movie.utils.DateUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieResponse toResponses(Movie movies) {
        return MovieResponse.builder()
                .id(movies.getId())
                .name(movies.getName())
                .introduction(movies.getIntroduction())
                .releaseTime(DateUtils.dateFormat(movies.getReleaseTime()))
                .duration(movies.getDuration())
                .types(movies.getTypes())
                .postUrl(movies.getPostUrl())
                .build();
    }
}
