package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Cart;
import com.capgemini.service.DiscountService;

@RestController
public class DiscountActionController {
	@Autowired
	public DiscountService discountservice;
	@RequestMapping(value="/discountCalculation",method=RequestMethod.GET)
	public Cart discountCalculation(int id ) {
		return discountservice.discountCalculation(id);
	}
}
