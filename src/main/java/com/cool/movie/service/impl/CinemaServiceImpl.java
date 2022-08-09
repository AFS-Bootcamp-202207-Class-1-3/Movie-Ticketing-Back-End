package com.cool.movie.service.impl;

import com.cool.movie.entity.Cinema;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.CinemaRepository;
import com.cool.movie.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cinema)
 *
 * @author makejava
 * @since 2022-08-07 22:52:54
 */
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService {


    @Resource
    private CinemaRepository cinemaRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Cinema findById(String id) {
        return cinemaRepository.findById(id).orElseThrow(() -> new NotFoundException(Cinema.class.getSimpleName()));
    }

    /**
     * findByParam
     *
     * @param cinema
     */
    @Override
    public List<Cinema> findByParam(Cinema cinema) {
        return null;
    }

    /**
     * save one
     *
     * @param cinema
     */
    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    /**
     * save
     *
     * @param cinemas
     */
    @Override
    public List<Cinema> save(List<Cinema> cinemas) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.cinemaRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.cinemaRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id
     */
    @Override
    public boolean existsById(String id) {
        return cinemaRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return cinemaRepository.count();
    }
}

