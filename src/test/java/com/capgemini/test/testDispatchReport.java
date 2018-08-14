package com.capgemini.test;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.exception.ProductNotFoundException;

public class testDispatchReport {
	
	
	@Before
	public void init()
	{
		
	}
	
	@Test(expected=ProductNotFoundException.class)
	public void whenProductNotFound()throws ProductNotFoundException
	{
		
	}
	
	
	@Test(expected=CategoryNotFoundException.class)
	public void whenCategoryNotFound()throws CategoryNotFoundException
	{
		
	}
	
	@Test(expected=MerchantNotFoundException.class)
	public void whenMerchantNotFound()throws MerchantNotFoundException
	{
		
	}
	
	@Test
	public void whenProductIsFound() throws ProductNotFoundException
	{
		
	}
	
	@Test
	public void whenCategoryIsFound() throws CategoryNotFoundException
	{
		
	}
	
	@Test
	public void whenMerchantIsFound() throws MerchantNotFoundException
	{
		
	}
	
	@After
	public void close()
	{
		
	}
 }
