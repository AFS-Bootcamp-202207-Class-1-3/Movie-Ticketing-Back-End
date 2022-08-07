package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.repository.MovieScheduleRepository;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieSchedule)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */
@Service("movieScheduleService")
public class MovieScheduleServiceImpl implements MovieScheduleService {


    @Resource
    private MovieScheduleRepository movieScheduleRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<MovieSchedule> findById() {
        return movieScheduleRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param movieSchedule 条件参数
     */
    @Override
    public List<MovieSchedule> findByParam(MovieSchedule movieSchedule) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param movieSchedule 实体类
     */
    @Override
    public MovieSchedule save(MovieSchedule movieSchedule) {
        return movieScheduleRepository.save(movieSchedule);
    }

    /**
     * 保存多条数据
     *
     * @param movieSchedules 实体类
     */
    @Override
    public List<MovieSchedule> save(List<MovieSchedule> movieSchedules) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.movieScheduleRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieScheduleRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return movieScheduleRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<MovieSchedule> findAll() {
        return movieScheduleRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return movieScheduleRepository.count();
    }
}

