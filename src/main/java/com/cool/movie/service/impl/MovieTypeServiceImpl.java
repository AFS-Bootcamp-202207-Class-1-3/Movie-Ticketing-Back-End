package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieType;
import com.cool.movie.repository.MovieTypeRepository;
import com.cool.movie.service.MovieTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieType)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:16
 */
@Service("movieTypeService")
public class MovieTypeServiceImpl implements MovieTypeService {


    @Resource
    private MovieTypeRepository movieTypeRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<MovieType> findById() {
        return movieTypeRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param movieType 条件参数
     */
    @Override
    public List<MovieType> findByParam(MovieType movieType) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param movieType 实体类
     */
    @Override
    public MovieType save(MovieType movieType) {
        return movieTypeRepository.save(movieType);
    }

    /**
     * 保存多条数据
     *
     * @param movieTypes 实体类
     */
    @Override
    public List<MovieType> save(List<MovieType> movieTypes) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.movieTypeRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieTypeRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return movieTypeRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<MovieType> findAll() {
        return movieTypeRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return movieTypeRepository.count();
    }
}

