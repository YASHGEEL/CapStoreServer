package com.capgemini.service;

import com.capgemini.model.Cart;
import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;

public interface PlaceOrderService {

	public OrderDetails PlaceOrder(Cart cart,Customer customer);
}
