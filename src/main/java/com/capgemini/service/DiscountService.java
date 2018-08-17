package com.capgemini.service;

import com.capgemini.model.Cart;
import com.capgemini.model.Product;

public interface DiscountService {
	public Cart discountCalculation(int id);
}
