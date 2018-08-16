package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;

public class testPlaceOrder {

	@Test(expected=ProductNotFoundException.class)
	public void testViewProductNotFound() {
		
	}
	
	@Test(expected=CategoryNotFoundException.class)
	public void testViewCategoryNotFound() {
		
	}
	
	@Test
	public void testViewCart() {
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testViewCartisEmpty() throws NullPointerException{
		
	}
	
	@Test
	public void testCustomerDetails() {
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testCustomerDetailsisEmpty() throws NullPointerException {
		
	}
}
