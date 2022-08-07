package com.cool.movie.service.impl;

import com.cool.movie.entity.Pay;
import com.cool.movie.repository.PayRepository;
import com.cool.movie.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pay)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
@Service("payService")
public class PayServiceImpl implements PayService {


    @Resource
    private PayRepository payRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Pay> findById() {
        return payRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param pay 条件参数
     */
    @Override
    public List<Pay> findByParam(Pay pay) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param pay 实体类
     */
    @Override
    public Pay save(Pay pay) {
        return payRepository.save(pay);
    }

    /**
     * 保存多条数据
     *
     * @param pays 实体类
     */
    @Override
    public List<Pay> save(List<Pay> pays) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.payRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.payRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return payRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Pay> findAll() {
        return payRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return payRepository.count();
    }
}

