package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;

public interface GenerateInvoiceService {
	
	public List generate_invoice(int order_id) throws OrderDetailsNotFoundException;

}
