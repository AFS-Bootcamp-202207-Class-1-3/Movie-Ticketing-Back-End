package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Order)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */

@Entity
public class Order implements Serializable {

    private static final long serialVersionUID = 177810964698268933L;


    /**
     * ����ID
     */
    @Id
    private String id;

    /**
     * ��ӰID
     */
    private String movieId;

    /**
     * �۸�
     */
    private Object price;

    /**
     * �Ƿ�֧��(Boolean)
     */
    private Object isPay;

}

