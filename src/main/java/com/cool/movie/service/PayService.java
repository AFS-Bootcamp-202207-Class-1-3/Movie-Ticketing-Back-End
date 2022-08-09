package com.cool.movie.service;


import com.cool.movie.entity.Pay;

import java.util.List;


public interface PayService {

    /**
     * findById
     *
     * @param id
     */
    Pay findById(String id);

    /**
     * findByParam
     *
     * @param pay
     */
    List<Pay> findByParam(Pay pay);

    /**
     * save one
     *
     * @param pay
     */
    Pay update(Pay pay);

    /**
     * save
     *
     * @param pays
     */
    List<Pay> save(List<Pay> pays);

    /**
     * deleteById
     *
     * @param id
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
    Iterable<Pay> findAll();

    /**
     * count
     */
    long count();
}

