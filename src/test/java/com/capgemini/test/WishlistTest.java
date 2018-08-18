package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.model.WishList;
import com.capgemini.repository.WishlistRepository;
import com.capgemini.service.WishlistService;
import com.capgemini.service.WishlistServiceImpl;

public class WishlistTest {
	WishlistService wishlistService;

	@Mock
	WishlistRepository Repository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void addproducts() {

	}

	@Test
	public void removeproducts() {

	}

	@Test
	public void display() {

	}

	@Test(expected = ProductNotFoundException.class)
	public void productnotfoundexception() {

	}
}