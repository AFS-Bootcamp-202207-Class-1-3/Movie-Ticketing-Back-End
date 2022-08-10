package com.cool.movie.controller;


import com.cool.movie.dto.MovieScheduleResponse;
import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.service.MovieScheduleService;
import com.cool.movie.utils.CopyListMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("movieSchedule")
@CrossOrigin
public class MovieScheduleController {

    @Resource
    private MovieScheduleService movieScheduleService;

    @Resource
    private CopyListMapper copyListMapper;


    @GetMapping
    public void selectAll(MovieSchedule movieSchedule) {
    }

    //按照电影院查找场次
    @GetMapping("cinema/{CinemaId}")
    public List<MovieScheduleResponse> selectAllByCinemaId(@PathVariable String CinemaId) {
        return copyListMapper.copyListProperties(movieScheduleService.findMovieSchedulesByCinemaId(CinemaId),MovieScheduleResponse::new);
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

