package com.cool.movie.controller;


import com.cool.movie.dto.moviedto.MoviePage;
import com.cool.movie.dto.moviedto.MovieResponse;
import com.cool.movie.entity.Movie;
import com.cool.movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    public MovieResponse selectOne(@PathVariable String id) {
        return movieService.findById(id);
    }

    @GetMapping(params = {"pageSize", "pageNumber"})
    public MoviePage selectByPage(@RequestParam(value = "pageSize", defaultValue = "1", required = false) Integer pageSize
            , @RequestParam(value = "pageNumber", defaultValue = "6", required = false) Integer pageNumber) {
        return movieService.findByPage(pageSize, pageNumber);
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

