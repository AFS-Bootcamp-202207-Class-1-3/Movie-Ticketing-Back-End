package com.cool.movie.service.impl;

import com.cool.movie.entity.Pay;
import com.cool.movie.repository.PayRepository;
import com.cool.movie.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pay)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
@Service("payService")
public class PayServiceImpl implements PayService {


    @Resource
    private PayRepository payRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Pay> findById() {
        return payRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param pay ��������
     */
    @Override
    public List<Pay> findByParam(Pay pay) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param pay ʵ����
     */
    @Override
    public Pay save(Pay pay) {
        return payRepository.save(pay);
    }

    /**
     * �����������
     *
     * @param pays ʵ����
     */
    @Override
    public List<Pay> save(List<Pay> pays) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.payRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.payRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return payRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Pay> findAll() {
        return payRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return payRepository.count();
    }
}

