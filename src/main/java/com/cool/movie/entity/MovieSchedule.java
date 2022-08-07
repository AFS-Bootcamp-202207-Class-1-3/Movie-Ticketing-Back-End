package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (MovieSchedule)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */

@Entity
public class MovieSchedule implements Serializable {

    private static final long serialVersionUID = 140755435576497910L;


    /**
     * ����ID
     */
    @Id
    private String id;

    /**
     * ��ӰԺID
     */
    private String cinemaId;

    /**
     * ��Ӱid
     */
    private String movieId;

    /**
     * ��ʼʱ��
     */
    private Object startTime;

    /**
     * ����
     */
    private Integer capacity;

    /**
     * ʣ������
     */
    private Integer availablePosition;

    /**
     * �۸�
     */
    private Object price;

}

