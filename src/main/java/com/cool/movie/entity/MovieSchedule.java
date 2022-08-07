package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (MovieSchedule)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */

@Entity
public class MovieSchedule implements Serializable {

    private static final long serialVersionUID = 140755435576497910L;


    /**
     * 场次ID
     */
    @Id
    private String id;

    /**
     * 电影院ID
     */
    private String cinemaId;

    /**
     * 电影id
     */
    private String movieId;

    /**
     * 开始时间
     */
    private Object startTime;

    /**
     * 容量
     */
    private Integer capacity;

    /**
     * 剩余容量
     */
    private Integer availablePosition;

    /**
     * 价格
     */
    private Object price;

}

