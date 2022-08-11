package com.cool.movie.mapper;

import com.cool.movie.dto.movieschedule.MovieScheduleResponse;
import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.utils.DateUtils;
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
            response.setStartTime(DateUtils.dateFormatForTimeStamp(movieSchedule.getStartTime()));
            responses.add(response);
        }
        return responses;
    }
}
