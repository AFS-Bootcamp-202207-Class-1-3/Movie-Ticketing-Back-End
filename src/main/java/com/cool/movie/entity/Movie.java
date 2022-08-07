package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Movie)��ʵ����
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
     * ��Ӱ����
     */
    private String name;

    /**
     * ��Ӱ����
     */
    private String introduction;

    /**
     * ��ӳʱ��
     */
    private Object releaseTime;

    /**
     * ��Ӱ����
     */
    private String types;

}

