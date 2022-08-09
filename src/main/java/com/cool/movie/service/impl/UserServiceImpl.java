package com.cool.movie.service.impl;

import com.cool.movie.entity.Customer;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.UserRepository;
import com.cool.movie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Customer findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(Customer.class.getSimpleName()));
    }

    /**
     * findByParam
     *
     * @param customer
     */
    @Override
    public List<Customer> findByParam(Customer customer) {
        return null;
    }

    /**
     * save one
     *
     * @param customer
     */
    @Override
    public Customer save(Customer customer) {
        return userRepository.save(customer);
    }

    /**
     * save
     *
     * @param customers
     */
    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.userRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id
     */
    @Override
    public boolean existsById(String id) {
        return userRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<Customer> findAll() {
        return userRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return userRepository.count();
    }
}

