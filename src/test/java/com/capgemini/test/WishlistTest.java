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
		
		wishlistService = new WishlistServiceImpl(Repository);
	}

	@Test
	public void addproducts()
	{
		WishList wishlist=new WishList();
		Product product=new Product();
		product.setId(123);
		wishlistService.add(product);
		assertEquals(product.getId(), 123);
	}
	@Test
	public void removeproducts()
	{
		
		Product product=new Product();
		product.setId(456);
		wishlistService.remove(product);
		assertNotEquals(product.getId(), 456);
	}
	@Test
	public void addproducts2()
	{
		
		Product product=new Product();
		product.setId(-1);
		wishlistService.add(product);
		assertNotEquals(null, -1);
	}
	@Test
	public void display() 
	{
		
		Product product=new Product();
		wishlistService.display();
		List<Product> list=new ArrayList<>();
		list.add(product);
		assertEquals(null,list);
		
	}
	@Test
	public void display2() 
	{
		
		Product product=new Product();
		product.setId(123);
		wishlistService.display();
		List<Product> list=new ArrayList<>();
		list.add(product);
		assertNotEquals(null,list);
		
	}
	@Test(expected=ProductNotFoundException.class)
	public void productnotfoundexception()
	{
		
	}
	}


