package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Cinema)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:08
 */

@Entity
public class Cinema implements Serializable {

    private static final long serialVersionUID = -50881050821715426L;


    /**
     * ��ӰԺid
     */
    @Id
    private String id;

    /**
     * ��ӰԺ����
     */
    private String name;

    /**
     * ��ӰԺλ��
     */
    private String location;

}

