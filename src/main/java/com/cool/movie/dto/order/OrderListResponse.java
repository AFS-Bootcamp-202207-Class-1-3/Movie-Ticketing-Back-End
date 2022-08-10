package com.cool.movie.dto.order;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

public interface OrderListResponse {
    String getId();
    String getName();
    Date getStartTime();
    Double getPrice();
    Boolean getIsPay();
}
