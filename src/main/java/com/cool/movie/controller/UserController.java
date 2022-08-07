package com.cool.movie.controller;


import com.cool.movie.entity.User;
import com.cool.movie.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (User)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:23
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * �������
     */
    @Resource
    private UserService userService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param user ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(User user) {

    }

    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }

    /**
     * ��������
     *
     * @param user ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody User user) {

    }

    /**
     * �޸�����
     *
     * @param user ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody User user) {

    }

    /**
     * ɾ������
     *
     * @param idList �������
     * @return ɾ�����
     */
    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

