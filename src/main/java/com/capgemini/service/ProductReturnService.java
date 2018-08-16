package com.capgemini.service;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;


public interface ProductReturnService {
	OrderDetails returnProduct(int id) throws OrderDetailsNotFoundException;
}
