package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (MovieType)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */

@Entity
public class MovieType implements Serializable {

    private static final long serialVersionUID = 652292350566812320L;


    /**
     * ��Ӱ����ID
     */
    @Id
    private String id;

    /**
     * ��Ӱ����
     */
    private String type;

    /**
     * �û�ID
     */
    private String userId;

}

