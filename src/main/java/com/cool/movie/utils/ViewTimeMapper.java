package com.cool.movie.utils;

import com.cool.movie.dto.movieschedule.MovieScheduleResponse;
import com.cool.movie.entity.MovieSchedule;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import static org.springframework.beans.BeanUtils.copyProperties;

@Component
public class ViewTimeMapper {
    public List<MovieScheduleResponse> toResponse(List<MovieSchedule> movieSchedules) {
        List<MovieScheduleResponse> responses = new ArrayList<>();
        for (MovieSchedule movieSchedule : movieSchedules) {
            MovieScheduleResponse response = new MovieScheduleResponse();
            BeanUtils.copyProperties(movieSchedule, response);
            response.setStartTime(movieSchedule.getStartTime().toString());
            responses.add(response);
        }
        return responses;
    }
}
