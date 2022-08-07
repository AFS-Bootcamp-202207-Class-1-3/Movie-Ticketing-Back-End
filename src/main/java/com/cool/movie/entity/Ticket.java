package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Ticket)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */

@Entity
public class Ticket implements Serializable {

    private static final long serialVersionUID = 170259298018195536L;


    /**
     * 票据ID
     */
    @Id
    private String id;

    /**
     * 价格
     */
    private Object price;

    private String ticketCode;

    /**
     * 用户ID
     */
    private String userId;

}

