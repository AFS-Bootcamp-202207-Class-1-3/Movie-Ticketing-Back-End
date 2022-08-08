package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieType;
import com.cool.movie.repository.MovieTypeRepository;
import com.cool.movie.service.MovieTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieType)
 *
 * @author makejava
 * @since 2022-08-07 22:52:56
 */
@Service("movieTypeService")
public class MovieTypeServiceImpl implements MovieTypeService {


    @Resource
    private MovieTypeRepository movieTypeRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<MovieType> findById(String id) {
        return movieTypeRepository.findById(id);
    }

    /**
     * findByParam
     *
     * @param movieType
     */
    @Override
    public List<MovieType> findByParam(MovieType movieType) {
        return null;
    }

    /**
     * save one
     *
     * @param movieType
     */
    @Override
    public MovieType save(MovieType movieType) {
        return movieTypeRepository.save(movieType);
    }

    /**
     * save
     *
     * @param movieTypes
     */
    @Override
    public List<MovieType> save(List<MovieType> movieTypes) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.movieTypeRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.movieTypeRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return movieTypeRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<MovieType> findAll() {
        return movieTypeRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return movieTypeRepository.count();
    }
}

