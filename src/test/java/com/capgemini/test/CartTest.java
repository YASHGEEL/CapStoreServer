package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.model.Cart;
import com.capgemini.model.Product;
import com.capgemini.repository.CartRepository;

import com.capgemini.service.CartServiceImpl;
import com.capgemini.service.ICartService;

public class CartTest {
	
	ICartService cartService;
	
	@Mock
	CartRepository repo;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
		//cartService=new CartServiceImpl(repo);
	}
	
	@Test
	public void whenValidInfoIsPassedToAddCart() 
	{
		/*//Cart cart=new Cart();
		Product product=new Product();
		product.setId(101);
		cartService.addCartItem(101);*/
		
	
	}
	
	@Test
	public void whenValidIdExistThenRemoveFromCart()
	{
		
	}
	
	@Test 
	public void whenIdDoesNotExistThenViewCartIsNotPossible()
	{
		
	}
	
	@Test
	public void whenValidIdExistThenViewCart()
	{
		
	}
	
	@Test
	public void whenProductExistEvenafterRemoveFromDataBase()
	{
		
	}
	
	@Test
	public void whenProductIsSuccessfullyRemovedFromDataBase()
	{
		
	}
	
	@Test
	public void whenQuantityOfProductIsChangedThenUpdateCart()
	{
		
	}
	
	
	

}
