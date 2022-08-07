package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Cinema)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:08
 */

@Entity
public class Cinema implements Serializable {

    private static final long serialVersionUID = -50881050821715426L;


    /**
     * 电影院id
     */
    @Id
    private String id;

    /**
     * 电影院名称
     */
    private String name;

    /**
     * 电影院位置
     */
    private String location;

}

