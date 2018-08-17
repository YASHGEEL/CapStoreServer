package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.OrderDetails;
import com.capgemini.service.DeliveryProductsService;
@RestController
public class DeliveryProductsController {
	@Autowired
	DeliveryProductsService deliveryProductsService;
	
	@RequestMapping(value="/deliveryproducts1",method=RequestMethod.GET)
	public OrderDetails quantityupdate1(int id)
	{
		return deliveryProductsService.deliveringProducts(id);
	}
}
