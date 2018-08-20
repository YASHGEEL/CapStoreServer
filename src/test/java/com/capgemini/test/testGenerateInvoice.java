package com.capgemini.test;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InvalidOrderIdException;
import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;
import com.capgemini.repository.InvoiceRepository;
import com.capgemini.service.GenerateInvoiceService;
import com.capgemini.service.GenerateInvoiceServiceImpl;

public class testGenerateInvoice {

	GenerateInvoiceService service;

	@Mock
	InvoiceRepository repository;

	@Before
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);
		service = new GenerateInvoiceServiceImpl();

	}

	@Test
	public void testvalidOrderDetails() {

		OrderDetails order = new OrderDetails(1001, null, null, null, 5000, 50,
				new Customer(1, null, null, "abc", "Nagpur", null, null, null, null, null, null, null, null), null);
		List list1 = new ArrayList<>();
		list1.add(order);
		when(repository.getOrderDetails()).thenReturn(list1);
	}

	@Test(expected = NullPointerException.class)
	public void testorderIdNotFound() throws OrderDetailsNotFoundException {

		service.generate_invoice(9999);

	}

}
