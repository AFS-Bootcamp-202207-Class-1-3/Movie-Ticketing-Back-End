package com.cool.movie.controller;


import com.cool.movie.entity.MovieType;
import com.cool.movie.service.MovieTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("movieType")
public class MovieTypeController {

    @Resource
    private MovieTypeService movieTypeService;


    @GetMapping
    public void selectAll(MovieType movieType) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody MovieType movieType) {

    }


    @PutMapping
    public void update(@RequestBody MovieType movieType) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

