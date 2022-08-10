package com.cool.movie.service;

import com.cool.movie.dto.bill.BillResponse;

public interface BillService {
    BillResponse getBill(String orderId);
}
