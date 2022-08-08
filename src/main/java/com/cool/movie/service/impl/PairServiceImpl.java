package com.cool.movie.service.impl;

import com.cool.movie.entity.Pair;
import com.cool.movie.repository.PairRepository;
import com.cool.movie.service.PairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pair)
 *
 * @author makejava
 * @since 2022-08-07 22:52:57
 */
@Service("pairService")
public class PairServiceImpl implements PairService {


    @Resource
    private PairRepository pairRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<Pair> findById(String id) {
        return pairRepository.findById(id);
    }

    /**
     * findByParam
     *
     * @param pair
     */
    @Override
    public List<Pair> findByParam(Pair pair) {
        return null;
    }

    /**
     * save one
     *
     * @param pair
     */
    @Override
    public Pair save(Pair pair) {
        return pairRepository.save(pair);
    }

    /**
     * save
     *
     * @param pairs
     */
    @Override
    public List<Pair> save(List<Pair> pairs) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.pairRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.pairRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id
     */
    @Override
    public boolean existsById(String id) {
        return pairRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<Pair> findAll() {
        return pairRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return pairRepository.count();
    }
}

