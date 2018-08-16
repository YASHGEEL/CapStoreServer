package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.OrderDetails;
import com.capgemini.service.ProductReturnService;

@RestController
public class ProductReturnController {

	@Autowired
	ProductReturnService productReturnService;
	
	
	@RequestMapping("/returnPurchasedProduct")
	public OrderDetails getProductReturnDetails(int id)
	{
		return productReturnService.returnProduct(id);
	}
	
	
}
