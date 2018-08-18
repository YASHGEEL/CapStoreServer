package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;
import com.capgemini.service.ProductReturnService;

@RestController
public class ProductReturnController {

	@Autowired
	ProductReturnService productReturnService;
	
	
	@RequestMapping("/returnPurchasedProduct")
	public OrderDetails getProductReturnDetails(int orderId,int productId) throws OrderDetailsNotFoundException
	{
		return productReturnService.returnProduct(orderId,productId);
	}
	
	/*@RequestMapping("/returnPurchasedOrder")
	public OrderDetails getOrderReturnDetails(int orderId) throws OrderDetailsNotFoundException
	{
		return productReturnService.returnOrder(orderId);
	}*/
	
	
	
}
