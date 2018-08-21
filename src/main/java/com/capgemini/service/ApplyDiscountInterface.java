package com.capgemini.service;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.model.Discount;
import com.capgemini.model.Product;

public interface ApplyDiscountInterface {

	public Product discountDB(int id, Discount discount);

	Product discountDB(Product product);
}
