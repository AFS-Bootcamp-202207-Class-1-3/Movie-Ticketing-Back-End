package com.cool.movie.service.impl;

import com.cool.movie.entity.Pay;
import com.cool.movie.repository.PayRepository;
import com.cool.movie.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pay)
 *
 * @author makejava
 * @since 2022-08-07 22:52:58
 */
@Service("payService")
public class PayServiceImpl implements PayService {


    @Resource
    private PayRepository payRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<Pay> findById(String id) {
        return payRepository.findById(id);
    }

    /**
     * findByParam
     *
     * @param pay
     */
    @Override
    public List<Pay> findByParam(Pay pay) {
        return null;
    }

    /**
     * save one
     *
     * @param pay
     */
    @Override
    public Pay update(Pay pay) {
        Pay updatePay = payRepository.findByOrdersIds(pay.getOrdersIds());
        updatePay.setStatus(1);
        updatePay.setTotalPrice(pay.getTotalPrice());
        return payRepository.save(updatePay);
    }

    /**
     * save
     *
     * @param pays
     */
    @Override
    public List<Pay> save(List<Pay> pays) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.payRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.payRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return payRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<Pay> findAll() {
        return payRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return payRepository.count();
    }
}

