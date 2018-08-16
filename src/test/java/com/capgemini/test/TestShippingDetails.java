package com.capgemini.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.exception.InvalidCustomerIdException;
import com.capgemini.model.Customer;
import com.capgemini.repository.ShippingDetailsRepository;
import com.capgemini.repository.UserRepository;
import com.capgemini.service.ShippingDetails;
import com.capgemini.service.ShippingDetailsImpl;

public class TestShippingDetails {
	@Autowired
	ShippingDetails shippingDetailsService;
	@Mock
	ShippingDetailsRepository shippingDetailsRepo;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		shippingDetailsService=new ShippingDetailsImpl(shippingDetailsRepo);
	}
	@Test(expected=InvalidCustomerIdException.class)
	public void testCustomerExisting() throws InvalidCustomerIdException{
		
		
	}
	@Test(expected=InvalidCustomerIdException.class)
	public void testCustomerNonExisting() throws InvalidCustomerIdException {
		    
	}

}
