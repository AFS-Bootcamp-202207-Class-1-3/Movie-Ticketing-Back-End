package com.cool.movie.dto.order;
import java.util.Date;

public interface OrderListResponse {
    String getId();
    String getName();
    Date getStartTime();
    Double getPrice();
    Boolean getIsPay();
}
