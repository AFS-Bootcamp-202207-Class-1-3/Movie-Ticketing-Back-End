package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Movie)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:12
 */

@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 453243192035227036L;


    /**
     * ID
     */
    @Id
    private String id;

    /**
     * 电影名称
     */
    private String name;

    /**
     * 电影介绍
     */
    private String introduction;

    /**
     * 上映时间
     */
    private Object releaseTime;

    /**
     * 电影类型
     */
    private String types;

}

