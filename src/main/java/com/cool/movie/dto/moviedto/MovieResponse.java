package com.cool.movie.dto.moviedto;


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }
}
