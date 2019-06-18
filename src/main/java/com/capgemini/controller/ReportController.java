package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.service.DispatchReportService;

@RestController
public class ReportController {
	@Autowired
	DispatchReportService service;
	
	
	@RequestMapping(value="/report/{prodId}",method=RequestMethod.GET)
	public List getAllProducts(@PathVariable int prodId)
	{
		List list = null;
		try {
		list= service.displayReportForProduct(prodId);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 return list;
	}
	
	@RequestMapping(value="/reportCategory/{catId}",method=RequestMethod.GET)
	public List getReportsForCategory(@PathVariable int catId)
	{
		List list = null;
	
		try {
			list= service.displayReportForCategory(catId);
		} catch (CategoryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 return list;
	}
	
	@RequestMapping(value="/reportMerchant/{mId}",method=RequestMethod.GET)
	public List getReportsForMerchant(@PathVariable int mId)
	{
		List list = null;
	
	
			
				try {
					list= service.displayReportForMerchant(mId);
				} catch (MerchantNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		 
	 return list;
	}
}
