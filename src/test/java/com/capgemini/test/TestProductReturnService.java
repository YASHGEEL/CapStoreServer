package com.capgemini.test;


import org.junit.Test;
import com.capgemini.exception.OrderDetailsNotFoundException;


/*
For successful return of the product 
1. Order Details should exist
2. Order Status has to be DELIVERED (it should not be NOTDELIVERED or RETURNED)
3. Product quantity has to be updated in the inventory and status has to be changed to "RETURNED" */


public class TestProductReturnService {

	
	//Order Details can't be found
	@Test(expected=OrderDetailsNotFoundException.class)
	public void testWhenOrderDetailsAreNotFound() throws OrderDetailsNotFoundException
	{
		
				
	}
	
	// Existence of valid  Order Details
	@Test
	public void testWhenOrderDetailsAreFound() throws OrderDetailsNotFoundException
	{
			
		
	}
	
	
	// Order Details are found, But order status= "NOTDELIVERED" or "RETURNED" then product can't be returned.
	@Test
	public void testWhenOrderStatusIsNotDeliveredOrReturnedThenProductReturnFails() throws OrderDetailsNotFoundException
	{
		
		
	}
		
	
	//Valid OrderDetails, OrderStatus and successful return of the product
	@Test
	public void testWhenOrderDetailsAndProductDetailsFoundThenProductIsReturned() throws OrderDetailsNotFoundException
	{
	
		
	}
	

}
