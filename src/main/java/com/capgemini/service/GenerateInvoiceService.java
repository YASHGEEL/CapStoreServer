package com.capgemini.service;

import com.capgemini.model.OrderDetails;

public interface GenerateInvoiceService {
	
	public OrderDetails generate_invoice(int order_id);

}
