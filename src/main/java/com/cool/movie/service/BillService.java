package com.cool.movie.service;

import com.cool.movie.dto.BillResponse;

public interface BillService {
    BillResponse getBill(String orderId);
}
