package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (Pair)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */

@Entity
public class Pair implements Serializable {

    private static final long serialVersionUID = 427075234961060497L;


    /**
     * 配对表ID
     */
    @Id
    private String id;

    /**
     * 用户A的ID
     */
    private String userId;

    /**
     * 同伴ID
     */
    private String partnerId;

}

