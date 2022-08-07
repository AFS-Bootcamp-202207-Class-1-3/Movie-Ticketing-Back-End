package com.cool.movie.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * (User)��ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -41363684177248129L;


    /**
     * �û�ID
     */
    @Id
    private String id;

    /**
     * �û���������
     */
    private String realName;

    /**
     * �û��ǳ�
     */
    private String nickName;

    /**
     * �û�ͷ���ַ
     */
    private String avatarUrl;

    /**
     * �û�����
     */
    private Integer age;

    /**
     * �û��Ա�
     */
    private String gender;

    /**
     * �û��绰����
     */
    private String phoneNumber;

    /**
     * �û����ڳ���
     */
    private String city;

    /**
     * �û����
     */
    private String introduction;

}

