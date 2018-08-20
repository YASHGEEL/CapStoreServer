package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Discount;
import com.capgemini.model.Product;
import com.capgemini.service.ApplyDiscountInterface;

@RestController
public class DiscountController {
	@Autowired
	ApplyDiscountInterface service;

	@RequestMapping(value = "/discountDB", method = RequestMethod.POST)
	public Product discountDB(@RequestBody Product product) {
		System.out.println(product.getId());

		return service.discountDB(product);

	}

}
