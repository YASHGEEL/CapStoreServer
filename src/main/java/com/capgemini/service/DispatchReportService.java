package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.OrderDetails;

public interface DispatchReportService {

	public List displayReportForProduct(int prodId) throws ProductNotFoundException;
	public List displayReportForCategory(int catId) throws CategoryNotFoundException;
	public List displayReportForMerchant(int merchantId) throws MerchantNotFoundException;
	
}
