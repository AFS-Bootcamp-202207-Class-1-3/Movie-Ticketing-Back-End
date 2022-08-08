package com.cool.movie.controller;


import com.cool.movie.entity.Movie;
import com.cool.movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("movie")
public class MovieController {

    @Resource
    private MovieService movieService;


    @GetMapping
    public void selectAll(Movie movie) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody Movie movie) {

    }


    @PutMapping
    public void update(@RequestBody Movie movie) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

