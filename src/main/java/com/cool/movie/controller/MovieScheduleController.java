package com.cool.movie.controller;


import com.cool.movie.dto.movieschedule.MovieScheduleResponse;
import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.service.MovieScheduleService;
import com.cool.movie.utils.ViewTimeMapper;
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
    private ViewTimeMapper viewTimeMapper;


    @GetMapping
    public void selectAll(MovieSchedule movieSchedule) {
    }

    //按照电影院查找场次
    @GetMapping(params = {"cinemaId", "movieId"})
    public List<MovieScheduleResponse> selectAllByCinemaIdAndMovieId(@RequestParam(value = "cinemaId") String cinemaId,@RequestParam(value = "movieId")  String movieId) {
        return viewTimeMapper.toResponse(movieScheduleService.getMovieSchedulesByCinemaIdAndMovieId(cinemaId,movieId));
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

