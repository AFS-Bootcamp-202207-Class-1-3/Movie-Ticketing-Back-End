package com.cool.movie.mapper;

import com.cool.movie.dto.bill.BillResponse;
import com.cool.movie.entity.Bill;
import org.springframework.stereotype.Component;

@Component
public class BillMapper {

    public BillResponse toResponse(Bill bill) {
      return BillResponse.builder()
              .movieName(bill.getMovieName())
              .ticketCode(bill.getTicketCode())
              .cinemaName(bill.getCinemaName())
              .movieSchedule(bill.getMovieSchedule())
              .room(bill.getRoom())
              .seating(bill.getSeating())
              .price(bill.getPrice())
              .partnerName(bill.getPartnerName())
              .partnerGender(bill.getPartnerGender())
              .partnerTelephone(bill.getPartnerTelephone())
              .build();
    }
}
