package com.cool.movie.service.impl;

import com.cool.movie.entity.Pair;
import com.cool.movie.repository.PairRepository;
import com.cool.movie.service.PairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pair)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:19
 */
@Service("pairService")
public class PairServiceImpl implements PairService {


    @Resource
    private PairRepository pairRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Pair> findById() {
        return pairRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param pair 条件参数
     */
    @Override
    public List<Pair> findByParam(Pair pair) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param pair 实体类
     */
    @Override
    public Pair save(Pair pair) {
        return pairRepository.save(pair);
    }

    /**
     * 保存多条数据
     *
     * @param pairs 实体类
     */
    @Override
    public List<Pair> save(List<Pair> pairs) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.pairRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.pairRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return pairRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Pair> findAll() {
        return pairRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return pairRepository.count();
    }
}

