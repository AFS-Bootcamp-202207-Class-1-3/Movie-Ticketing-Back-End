package com.cool.movie.service.impl;

import com.cool.movie.entity.Movie;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.MovieRepository;
import com.cool.movie.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Movie)
 *
 * @author makejava
 * @since 2022-08-07 22:52:55
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {


    @Resource
    private MovieRepository movieRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<Movie> findById(String id) {
        return Optional.ofNullable(movieRepository.findById(id)).orElseThrow(() -> new NotFoundException(Movie.class.getSimpleName()));
    }

    /**
     * findByParam
     *
     * @param movie
     */
    @Override
    public List<Movie> findByParam(Movie movie) {
        return null;
    }

    /**
     * save one
     *
     * @param movie
     */
    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    /**
     * save
     *
     * @param movies
     */
    @Override
    public List<Movie> save(List<Movie> movies) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.movieRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.movieRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return movieRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return movieRepository.count();
    }
}

