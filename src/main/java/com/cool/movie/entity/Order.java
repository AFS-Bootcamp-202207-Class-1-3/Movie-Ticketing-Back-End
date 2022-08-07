package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Order)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */

@Entity
public class Order implements Serializable {

    private static final long serialVersionUID = 177810964698268933L;


    /**
     * 订单ID
     */
    @Id
    private String id;

    /**
     * 电影ID
     */
    private String movieId;

    /**
     * 价格
     */
    private Object price;

    /**
     * 是否支付(Boolean)
     */
    private Object isPay;

}

