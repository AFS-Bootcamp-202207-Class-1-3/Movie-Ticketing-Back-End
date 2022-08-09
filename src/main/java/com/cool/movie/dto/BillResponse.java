package com.cool.movie.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BillResponse {
    private String movieName;
    private String ticketCode;
    private String cinemaName;
    private String movieSchedule;

    private String room;
    private String seating;
    private Double price;
    private String partnerName;
    private String partnerGender;
    private String partnerTelephone;

}
