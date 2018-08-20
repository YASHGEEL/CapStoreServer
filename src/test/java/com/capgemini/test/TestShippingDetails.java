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
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Tejaswini");
		customer.setEmail("Tejaswini.Pogaru@gmail.com");
		customer.setPhone("9876543210");
		customer.setAddress("SriSaiSadan");
		shippingDetailsRepo.save(customer);
		assertEquals(customer,shippingDetailsService.gettingShippingDeatilsOfCustomer(101));		
		
	}
	@Test(expected=InvalidCustomerIdException.class)
	public void testCustomerNonExisting() throws InvalidCustomerIdException {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Tejaswini");
		customer.setEmail("Tejaswini.Pogaru@gmail.com");
		customer.setPhone("9876543210");
		customer.setAddress("SriSaiSadan");
		shippingDetailsRepo.save(customer);
        assertNotEquals(null, shippingDetailsService.gettingShippingDeatilsOfCustomer(101));
		    
	}

}
