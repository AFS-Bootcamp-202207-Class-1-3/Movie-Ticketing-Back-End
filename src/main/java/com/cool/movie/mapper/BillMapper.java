package com.cool.movie.mapper;

import com.cool.movie.dto.BillResponse;
import com.cool.movie.entity.*;
import com.cool.movie.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class BillMapper {

    public BillResponse toResponse(CustomerOrder customerOrder, MovieSchedule movieSchedule, Cinema cinema, Movie movie, Customer pairCustomer) {
        BillResponse billResponse = new BillResponse();
        billResponse.setMovieName(movie.getName());
        billResponse.setTicketCode(customerOrder.getTicketCode());
        billResponse.setCinemaName(cinema.getName());
        billResponse.setSeating(movieSchedule.getRoom());
        billResponse.setMovieSchedule(MessageFormat.format("{0}", DateUtils.dateFormat(movieSchedule.getStartTime())));
        billResponse.setPrice(customerOrder.getPrice());
        billResponse.setPartnerName(pairCustomer.getRealName());
        billResponse.setPartnerGender(pairCustomer.getGender());
        billResponse.setPartnerTelephone(pairCustomer.getPhoneNumber());
        return billResponse;
    }
}
