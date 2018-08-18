package com.capgemini.service;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;


public interface ProductReturnService {
	OrderDetails returnProduct(int orderId,int productId) throws OrderDetailsNotFoundException;
	//OrderDetails returnOrder(int orderId) throws OrderDetailsNotFoundException;
}
