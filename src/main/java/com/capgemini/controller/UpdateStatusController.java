package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.OrderDetails;
import com.capgemini.service.UpdateStatus;

@RestController  
public class UpdateStatusController {

	@Autowired
	UpdateStatus service;
	
	@RequestMapping(value="/setDefaultStatus")
		public void setDefaultStatus(int id) {
		OrderDetails order=service.setDefaultStatus(id);
	}
	
	@RequestMapping(value="/updateStatus")
	public void updateStatus( int id) {
	service.updateStatus(id);
	}
	
	@RequestMapping(value="/displayDeliveryStatus")
	public String displayDeliveryStatus(int order_id) {
	return service.displayDeliveryStatus(order_id);
}
}
