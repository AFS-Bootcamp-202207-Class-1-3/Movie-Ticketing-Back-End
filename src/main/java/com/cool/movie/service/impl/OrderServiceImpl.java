package com.cool.movie.service.impl;


import com.cool.movie.dto.OrderListResponse;
import com.cool.movie.dto.order.OrderDetailResponse;
import com.cool.movie.dto.order.OrderForPairRequest;
import com.cool.movie.dto.order.OrderListResponse;
import com.cool.movie.dto.order.OrderRequest;
import com.cool.movie.dto.orderdto.OrderPage;
import com.cool.movie.entity.*;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.OrderDetailViewRepository;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.MovieScheduleService;
import com.cool.movie.service.MovieService;
import com.cool.movie.service.OrderService;
import com.cool.movie.mapper.OrderDetailMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.cool.movie.service.PairService;
import com.cool.movie.utils.GenerateSeatingUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * (Order)
 *
 * @author makejava
 * @since 2022-08-07 22:52:56
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    @Resource
    private OrderRepository orderRepository;

    @Resource
    private PairService pairService;

    @Resource
    private MovieScheduleService movieScheduleService;

    @Resource
    private OrderDetailViewRepository orderDetailViewRepository;

    @Resource
    OrderDetailMapper orderDetailMapper;


    public OrderDetailResponse getOrderDetailResponse(Serializable id) {
        OrderDetail orderDetail = orderDetailViewRepository.findById(String.valueOf(id)).orElseThrow(() -> new NotFoundException(OrderDetail.class.getSimpleName()));
        return orderDetailMapper.toResponse(orderDetail);
    }

    /**
     * findById
     *
     * @param id
     */
    @Override
    public CustomerOrder findById(String id) {
        return orderRepository.findById(id).orElseThrow(() -> new NotFoundException(CustomerOrder.class.getSimpleName()));
    }

    /**
     * findByParam
     *
     * @param customerOrder
     */
    @Override
    public List<CustomerOrder> findByParam(CustomerOrder customerOrder) {
        return null;
    }

    /**
     * save one
     *
     * @param request
     */
    //查MovieSchedule的price
    @Override
    public CustomerOrder save(OrderForPairRequest request) {
        MovieSchedule movieSchedule = movieScheduleService.findById(request.getMovieId());
        List<String> seatingList = GenerateSeatingUtils.generateSeating(movieSchedule.getCapacity(), movieSchedule.getAvailablePosition());
        movieSchedule.setAvailablePosition(movieSchedule.getAvailablePosition() - 2);
        CustomerOrder order = createOrder(request, movieSchedule, seatingList);
        CustomerOrder pairOrder = createPairOrder(request, movieSchedule, seatingList);

        savePair(request);
        orderRepository.save(pairOrder);
        return orderRepository.save(order);
    }

    private CustomerOrder createPairOrder(OrderForPairRequest request, MovieSchedule movieSchedule, List<String> seatingList) {
        return new CustomerOrder(UUID.randomUUID().toString(), request.getMovieId(),
                movieSchedule.getPrice(), request.getCinemaId(),false, request.getMovieScheduleId(), false,
                generateRandomTicketCode(), request.getPartnerId(), seatingList.get(1));
    }

    private CustomerOrder createOrder(OrderForPairRequest request, MovieSchedule movieSchedule, List<String> seatingList) {
        return new CustomerOrder(UUID.randomUUID().toString(), request.getMovieId(),
                movieSchedule.getPrice(), request.getCinemaId(),false, request.getMovieScheduleId(), false,
                generateRandomTicketCode(), request.getUserId(), seatingList.get(0));
    }


    /**
     * save
     *
     * @param customerOrders
     */
    @Override
    public List<CustomerOrder> save(List<CustomerOrder> customerOrders) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.orderRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.orderRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return orderRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<CustomerOrder> findAll() {
        return orderRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public CustomerOrder getSameViewingTime(OrderRequest orderRequest) {
        return orderRepository.getCustomerOrderByMovieScheduleIdAndCinemaIdAndUserId(orderRequest.getMovieScheduleId(),orderRequest.getCinemaId(),orderRequest.getUserId());
    }

    private String generateRandomTicketCode(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder ticketCodeStringBuffer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            ticketCodeStringBuffer.append(str.charAt(number));
        }
        return ticketCodeStringBuffer.toString();
    @Override
    public List<OrderListResponse> getOrderList(String userId, Integer pageSize, Integer startPage) {
        Integer result = (startPage - 1) * pageSize;
        return orderRepository.getOrderByUserIdAndByPage(userId,pageSize,result);
    }

    private String generateRandomTicketCode() {
        return UUID.randomUUID().toString();
    }

    private void savePair(OrderForPairRequest request) {
        pairService.save(new Pair(UUID.randomUUID().toString(), request.getUserId(), request.getPartnerId(),
                request.getMovieScheduleId()));
        pairService.save(new Pair(UUID.randomUUID().toString(), request.getPartnerId(), request.getUserId(),
                request.getMovieScheduleId()));
    }

    @Override
    public OrderPage findSingleByPage(Integer pageSize, Integer pageNumber, String userId) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        Page<OrderListResponse> singlePartnerByPage = orderRepository.getOrderByUserIdAndByPage(userId, pageRequest);
        OrderPage orderPage = new OrderPage(
                pageSize
                ,pageNumber
                ,singlePartnerByPage.getTotalPages()
                ,(int)singlePartnerByPage.getTotalElements()
                ,singlePartnerByPage.getNumberOfElements()
                ,singlePartnerByPage.toList()
        );
        return orderPage;
    }
}

