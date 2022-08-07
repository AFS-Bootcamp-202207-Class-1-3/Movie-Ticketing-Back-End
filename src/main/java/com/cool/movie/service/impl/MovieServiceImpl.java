package com.cool.movie.service.impl;

import com.cool.movie.entity.Movie;
import com.cool.movie.repository.MovieRepository;
import com.cool.movie.service.MovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Movie)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:13
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {


    @Resource
    private MovieRepository movieRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Movie> findById() {
        return movieRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movie ��������
     */
    @Override
    public List<Movie> findByParam(Movie movie) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param movie ʵ����
     */
    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    /**
     * �����������
     *
     * @param movies ʵ����
     */
    @Override
    public List<Movie> save(List<Movie> movies) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.movieRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.movieRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return movieRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return movieRepository.count();
    }
}

