package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.MovieScheduleRepository;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieSchedule)
 *
 * @author makejava
 * @since 2022-08-07 22:52:56
 */
@Service("movieScheduleService")
public class MovieScheduleServiceImpl implements MovieScheduleService {


    @Resource
    private MovieScheduleRepository movieScheduleRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<MovieSchedule> findById(String id) {
        return Optional.ofNullable(movieScheduleRepository.findById(id).orElseThrow(() -> new NotFoundException("MovieSchedule")));
    }

    /**
     * findByParam
     *
     * @param movieSchedule
     */
    @Override
    public List<MovieSchedule> findByParam(MovieSchedule movieSchedule) {
        return null;
    }

    /**
     * save one
     *
     * @param movieSchedule
     */
    @Override
    public MovieSchedule save(MovieSchedule movieSchedule) {
        return movieScheduleRepository.save(movieSchedule);
    }

    /**
     * save
     *
     * @param movieSchedules
     */
    @Override
    public List<MovieSchedule> save(List<MovieSchedule> movieSchedules) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.movieScheduleRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.movieScheduleRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id
     */
    @Override
    public boolean existsById(String id) {
        return movieScheduleRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<MovieSchedule> findAll() {
        return movieScheduleRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return movieScheduleRepository.count();
    }
}

