package com.cool.movie.service.impl;

import com.cool.movie.entity.Movie;
import com.cool.movie.repository.MovieRepository;
import com.cool.movie.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Movie)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:13
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {


    @Resource
    private MovieRepository movieRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Movie> findById() {
        return movieRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param movie 条件参数
     */
    @Override
    public List<Movie> findByParam(Movie movie) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param movie 实体类
     */
    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    /**
     * 保存多条数据
     *
     * @param movies 实体类
     */
    @Override
    public List<Movie> save(List<Movie> movies) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.movieRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return movieRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return movieRepository.count();
    }
}

