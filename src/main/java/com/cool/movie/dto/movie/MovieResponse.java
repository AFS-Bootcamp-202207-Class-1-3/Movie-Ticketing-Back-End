package com.cool.movie.dto.movie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieResponse {
    private String id;
    private String name;
    private String introduction;
    private String releaseTime;
    private Integer duration;
    private String types;
    private String postUrl;
}
