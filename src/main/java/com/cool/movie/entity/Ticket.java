package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Ticket)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */

@Entity
public class Ticket implements Serializable {

    private static final long serialVersionUID = 170259298018195536L;


    /**
     * Ʊ��ID
     */
    @Id
    private String id;

    /**
     * �۸�
     */
    private Object price;

    private String ticketCode;

    /**
     * �û�ID
     */
    private String userId;

}

