package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Pay)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:19
 */

@Entity
public class Pay implements Serializable {

    private static final long serialVersionUID = 544559011070675017L;


    /**
     * id
     */
    @Id
    private String id;

    /**
     * order的ID
     */
    private String ordersIds;

    /**
     * 总价
     */
    private Object totalPrice;

    /**
     * 支付状态(枚举未指定)
     */
    private Integer status;

}

