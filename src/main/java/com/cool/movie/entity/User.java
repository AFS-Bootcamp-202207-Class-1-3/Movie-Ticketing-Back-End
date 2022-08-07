package com.cool.movie.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -41363684177248129L;


    /**
     * 用户ID
     */
    @Id
    private String id;

    /**
     * 用户真是姓名
     */
    private String realName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像地址
     */
    private String avatarUrl;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 用户性别
     */
    private String gender;

    /**
     * 用户电话号码
     */
    private String phoneNumber;

    /**
     * 用户所在城市
     */
    private String city;

    /**
     * 用户简介
     */
    private String introduction;

}

