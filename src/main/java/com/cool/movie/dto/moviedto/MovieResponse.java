package com.cool.movie.dto.moviedto;

import lombok.Data;

@Data
public class MovieResponse {
    private String id;


    private String name;


    private String introduction;


    private String releaseTime;

    private Integer duration;

    private String types;

    private String postUrl;

    public MovieResponse(String id, String name, String introduction, String releaseTime, Integer duration, String types, String postUrl) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.releaseTime = releaseTime;
        this.duration = duration;
        this.types = types;
        this.postUrl = postUrl;
    }

    public MovieResponse() {
    }

}
