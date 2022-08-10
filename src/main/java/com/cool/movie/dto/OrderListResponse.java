package com.cool.movie.dto;
import java.util.Date;

public interface OrderListResponse {
    String getId();
    String getName();
    Date getStartTime();
    Double getPrice();
    Boolean getIsPay();
}
