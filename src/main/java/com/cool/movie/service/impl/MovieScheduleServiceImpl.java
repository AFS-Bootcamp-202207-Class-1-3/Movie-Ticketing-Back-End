package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.repository.MovieScheduleRepository;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieSchedule)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */
@Service("movieScheduleService")
public class MovieScheduleServiceImpl implements MovieScheduleService {


    @Resource
    private MovieScheduleRepository movieScheduleRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<MovieSchedule> findById() {
        return movieScheduleRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movieSchedule ��������
     */
    @Override
    public List<MovieSchedule> findByParam(MovieSchedule movieSchedule) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param movieSchedule ʵ����
     */
    @Override
    public MovieSchedule save(MovieSchedule movieSchedule) {
        return movieScheduleRepository.save(movieSchedule);
    }

    /**
     * �����������
     *
     * @param movieSchedules ʵ����
     */
    @Override
    public List<MovieSchedule> save(List<MovieSchedule> movieSchedules) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.movieScheduleRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieScheduleRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return movieScheduleRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<MovieSchedule> findAll() {
        return movieScheduleRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return movieScheduleRepository.count();
    }
}

