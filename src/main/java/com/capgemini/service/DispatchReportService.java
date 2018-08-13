package com.capgemini.service;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.OrderDetails;

public interface DispatchReportService {

	public OrderDetails displayReportForProduct(int prodId) throws ProductNotFoundException;
	public OrderDetails displayReportForCategory(int catId) throws CategoryNotFoundException;
	public OrderDetails displayReportForMerchant(int merchantId) throws MerchantNotFoundException;
	
}
