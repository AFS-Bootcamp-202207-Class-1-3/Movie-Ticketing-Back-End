package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Pair)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */

@Entity
public class Pair implements Serializable {

    private static final long serialVersionUID = 427075234961060497L;


    /**
     * ��Ա�ID
     */
    @Id
    private String id;

    /**
     * �û�A��ID
     */
    private String userId;

    /**
     * ͬ��ID
     */
    private String partnerId;

}

