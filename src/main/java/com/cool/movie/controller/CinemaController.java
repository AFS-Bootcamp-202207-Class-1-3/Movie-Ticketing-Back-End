package com.cool.movie.controller;


import com.cool.movie.entity.Cinema;
import com.cool.movie.service.CinemaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("cinema")
public class CinemaController {

    @Resource
    private CinemaService cinemaService;


    @GetMapping
    public void selectAll(Cinema cinema) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody Cinema cinema) {

    }


    @PutMapping
    public void update(@RequestBody Cinema cinema) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

