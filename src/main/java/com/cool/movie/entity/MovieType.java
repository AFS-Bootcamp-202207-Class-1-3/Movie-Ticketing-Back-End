package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (MovieType)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */

@Entity
public class MovieType implements Serializable {

    private static final long serialVersionUID = 652292350566812320L;


    /**
     * 电影类型ID
     */
    @Id
    private String id;

    /**
     * 电影类型
     */
    private String type;

    /**
     * 用户ID
     */
    private String userId;

}

