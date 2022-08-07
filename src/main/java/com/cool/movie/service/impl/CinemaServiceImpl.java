package com.cool.movie.service.impl;

import com.cool.movie.entity.Cinema;
import com.cool.movie.repository.CinemaRepository;
import com.cool.movie.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Cinema)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:10
 */
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService {


    @Resource
    private CinemaRepository cinemaRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Cinema> findById() {
        return cinemaRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param cinema 条件参数
     */
    @Override
    public List<Cinema> findByParam(Cinema cinema) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param cinema 实体类
     */
    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    /**
     * 保存多条数据
     *
     * @param cinemas 实体类
     */
    @Override
    public List<Cinema> save(List<Cinema> cinemas) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.cinemaRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.cinemaRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return cinemaRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return cinemaRepository.count();
    }
}

