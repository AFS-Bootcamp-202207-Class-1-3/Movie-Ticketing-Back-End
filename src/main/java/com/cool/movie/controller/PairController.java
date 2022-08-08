package com.cool.movie.controller;


import com.cool.movie.entity.Pair;
import com.cool.movie.service.PairService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("pair")
public class PairController {

    @Resource
    private PairService pairService;


    @GetMapping
    public void selectAll(Pair pair) {

    }


    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }


    @PostMapping
    public void insert(@RequestBody Pair pair) {

    }


    @PutMapping
    public void update(@RequestBody Pair pair) {

    }


    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

