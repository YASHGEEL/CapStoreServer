package com.capgemini.service;

import com.capgemini.model.OrderDetails;

public interface UpdateStatus {

	public OrderDetails setDefaultStatus(int id);
    public void updateStatus(int id);
    public String displayDeliveryStatus(int order_id);
	
}
