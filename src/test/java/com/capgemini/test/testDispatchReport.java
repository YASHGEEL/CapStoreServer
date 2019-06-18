package com.capgemini.test;



import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Category;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.ProductReportRepository;
import com.capgemini.service.DispatchReportService;
import com.capgemini.service.DispatchReportServiceImpl;

public class testDispatchReport {
	
DispatchReportService service;
	
	@Mock
	ProductReportRepository repository;
	
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		service=new DispatchReportServiceImpl(repository);
	}
	
	@Test(expected=ProductNotFoundException.class)
	public void whenProductNotFound()throws ProductNotFoundException
	{
		
		
		Product product1=new Product(1001,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,null,null,null,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		service.displayReportForProduct(1003);	
	}
	
	
	@Test(expected=CategoryNotFoundException.class)
	public void whenCategoryNotFound()throws CategoryNotFoundException
	{
		Category cat=new Category(401,null,null,"mobiles");
		Product product1=new Product(1001,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,null,null,cat,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		service.displayReportForCategory(402);
	}
	
	@Test(expected=MerchantNotFoundException.class)
	public void whenMerchantNotFound()throws MerchantNotFoundException
	{
		Merchant merchant=new Merchant(201,null,null,"Merchant1","Pune","9876543210",null,"merchant1@gmail.com","abcdef@123",null,null,null,4.5f,null);
		Product product1=new Product(1001,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,merchant,null,null,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		service.displayReportForMerchant(202);
	}
	
	@Test
	public void whenProductIsFound() throws ProductNotFoundException
	{
		Product product1=new Product(1005,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,null,null,null,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		List al=service.displayReportForProduct(1005);
	
		
	}
	
	@Test
	public void whenCategoryIsFound() throws CategoryNotFoundException
	{
		Category cat=new Category(401,null,null,"mobiles");
		Product product1=new Product(1001,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,null,null,cat,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		List al=service.displayReportForCategory(401);
		
	}
	
	@Test
	public void whenMerchantIsFound() throws MerchantNotFoundException
	{
		Merchant merchant=new Merchant(201,null,null,"Merchant1","Pune","9876543210",null,"merchant1@gmail.com","abcdef@123",null,null,null,4.5f,null);
		Product product1=new Product(1001,null,null,"xperia",null,null,0.0f,null,0,null,0,0.0f,null,merchant,null,null,null);
		List list=new ArrayList<>();
		list.add(product1);
		OrderDetails order=new OrderDetails(101,null,null,"delivered",5000.0f,2,new Customer(1,null,null,"abc",null,null,null,null,null,null,null,null,null),list);
		List orderdetails=new ArrayList<>();
		orderdetails.add(order);
		when(repository.getOrderDetails()).thenReturn(orderdetails);
		List al=service.displayReportForMerchant(201);
		
	}
	
	@After
	public void close()
	{
		service=null;
	}
 }
