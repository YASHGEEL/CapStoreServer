package com.capgemini.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.model.OrderDetails;
import com.capgemini.repository.UpdateStatusRepo;  
@Component 
public class UpdateStatusImpl implements UpdateStatus {
	
	@Autowired
	private UpdateStatusRepo repo;


	public UpdateStatusImpl(UpdateStatusRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public OrderDetails setDefaultStatus(int id) {
		OrderDetails order=repo.getOne(id);
		order.setStatus("Not Delivered");
		return repo.save(order);
	}

	@Override
	public void updateStatus(int id) {
		OrderDetails order=repo.getOne(id);
		order.setStatus("Delivered");
		repo.save(order);
		
	}


	@Override
	public String displayDeliveryStatus(int order_id) {
		return repo.displayDeliveryStatus(order_id);
		
	}

	
	}

	


