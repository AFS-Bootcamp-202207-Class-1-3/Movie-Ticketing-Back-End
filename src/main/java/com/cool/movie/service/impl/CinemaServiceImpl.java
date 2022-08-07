package com.cool.movie.service.impl;

import com.cool.movie.entity.Cinema;
import com.cool.movie.repository.CinemaRepository;
import com.cool.movie.service.CinemaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Cinema)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:10
 */
@Service("cinemaService")
public class CinemaServiceImpl implements CinemaService {


    @Resource
    private CinemaRepository cinemaRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Cinema> findById() {
        return cinemaRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param cinema ��������
     */
    @Override
    public List<Cinema> findByParam(Cinema cinema) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param cinema ʵ����
     */
    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    /**
     * �����������
     *
     * @param cinemas ʵ����
     */
    @Override
    public List<Cinema> save(List<Cinema> cinemas) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.cinemaRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.cinemaRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return cinemaRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return cinemaRepository.count();
    }
}

