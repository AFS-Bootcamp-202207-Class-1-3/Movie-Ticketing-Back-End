package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Pay)��ʵ����
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
     * order��ID
     */
    private String ordersIds;

    /**
     * �ܼ�
     */
    private Object totalPrice;

    /**
     * ֧��״̬(ö��δָ��)
     */
    private Integer status;

}

