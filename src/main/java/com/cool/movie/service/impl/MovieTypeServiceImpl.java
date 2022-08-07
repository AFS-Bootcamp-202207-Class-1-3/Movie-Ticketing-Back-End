package com.cool.movie.service.impl;

import com.cool.movie.entity.MovieType;
import com.cool.movie.repository.MovieTypeRepository;
import com.cool.movie.service.MovieTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (MovieType)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:16
 */
@Service("movieTypeService")
public class MovieTypeServiceImpl implements MovieTypeService {


    @Resource
    private MovieTypeRepository movieTypeRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<MovieType> findById() {
        return movieTypeRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movieType ��������
     */
    @Override
    public List<MovieType> findByParam(MovieType movieType) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param movieType ʵ����
     */
    @Override
    public MovieType save(MovieType movieType) {
        return movieTypeRepository.save(movieType);
    }

    /**
     * �����������
     *
     * @param movieTypes ʵ����
     */
    @Override
    public List<MovieType> save(List<MovieType> movieTypes) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.movieTypeRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieTypeRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return movieTypeRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<MovieType> findAll() {
        return movieTypeRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return movieTypeRepository.count();
    }
}

