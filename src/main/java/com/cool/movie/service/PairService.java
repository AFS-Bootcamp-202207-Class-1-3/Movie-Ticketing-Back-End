package com.cool.movie.service;


import com.cool.movie.dto.customerdto.CustomerPair;
import com.cool.movie.entity.Pair;

import java.util.List;


public interface PairService {


    Pair findByUserId(String userId);

    /**
     * findById
     *
     * @param
     */
    Pair findById(String id);

    /**
     * findByParam
     *
     * @param pair
     */
    List<Pair> findByParam(Pair pair);

    /**
     * save one
     *
     * @param pair
     */
    Pair save(Pair pair);

    /**
     * save
     *
     * @param pairs
     */
    List<Pair> save(List<Pair> pairs);

    /**
     * deleteById
     *
     * @param
     */
    void deleteById(String id);

    /**
     * deleteByIds
     *
     * @param ids
     */
    void deleteByIds(List<String> ids);


    /**
     * existsById
     *
     * @param id
     */
    boolean existsById(String id);

    /**
     * findAll
     */
    Iterable<Pair> findAll();

    /**
     * count
     */
    long count();

    CustomerPair getUserPairStatus(String userId, String movieScheduleId);

    void updatePartner(String partnerPairId, String partnerId);
}

