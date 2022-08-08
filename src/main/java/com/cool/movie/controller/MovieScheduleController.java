package com.cool.movie.controller;


import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("movieSchedule")
public class MovieScheduleController {

    @Resource
    private MovieScheduleService movieScheduleService;


    @GetMapping
    public void selectAll(MovieSchedule movieSchedule) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody MovieSchedule movieSchedule) {

    }


    @PutMapping
    public void update(@RequestBody MovieSchedule movieSchedule) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

