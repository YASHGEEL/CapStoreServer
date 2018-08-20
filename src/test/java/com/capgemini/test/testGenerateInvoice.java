package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InvalidOrderIdException;
import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Customer;
import com.capgemini.model.Discount;
import com.capgemini.model.InvoiceView;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
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
		service = new GenerateInvoiceServiceImpl(repository);

	}

	@Test
	public void testvalidOrderDetails() throws OrderDetailsNotFoundException, ProductNotFoundException {

		Discount discount = new Discount(4, null, null, 20, 0);
		Product product = new Product(10, null, null, "Bottle", "Tupperware", "bo1", 120, "available", 50, null, 4, 4,
				null, null, discount, null, null);
		List<Product> productList = new ArrayList<>();

		productList.add(product);

		Customer customer = new Customer(10, null, null, "Shrutika", "AUSTRALIA", "9876543210", "shrutisbkar@gmail.com",
				null, null, null, null, null, null);
		OrderDetails order = new OrderDetails(1001, null, null, "available", 1000, 2, customer, productList);

		when(repository.findById(1001)).thenReturn(order);
		List<InvoiceView> list = service.generate_invoice(1001);
		assertEquals(list.get(0).getCustName(), order.getCustomer().getName());

	}

	@Test(expected = OrderDetailsNotFoundException.class)
	public void testorderIdNotFound() throws OrderDetailsNotFoundException, ProductNotFoundException {

		service.generate_invoice(9999);

	}

	@Test(expected = ProductNotFoundException.class)
	public void testProductNotFound() throws OrderDetailsNotFoundException, ProductNotFoundException {
		OrderDetails order = new OrderDetails(1001, null, null, null, 5000, 50,
				new Customer(1, null, null, "abc", "Nagpur", null, null, null, null, null, null, null, null), null);
		when(repository.findById(1001)).thenReturn(order);
		service.generate_invoice(1001);

	}

}
