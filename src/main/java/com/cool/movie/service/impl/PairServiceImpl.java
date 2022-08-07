package com.cool.movie.service.impl;

import com.cool.movie.entity.Pair;
import com.cool.movie.repository.PairRepository;
import com.cool.movie.service.PairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Pair)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:19
 */
@Service("pairService")
public class PairServiceImpl implements PairService {


    @Resource
    private PairRepository pairRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Pair> findById() {
        return pairRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param pair ��������
     */
    @Override
    public List<Pair> findByParam(Pair pair) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param pair ʵ����
     */
    @Override
    public Pair save(Pair pair) {
        return pairRepository.save(pair);
    }

    /**
     * �����������
     *
     * @param pairs ʵ����
     */
    @Override
    public List<Pair> save(List<Pair> pairs) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.pairRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.pairRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return pairRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Pair> findAll() {
        return pairRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return pairRepository.count();
    }
}

