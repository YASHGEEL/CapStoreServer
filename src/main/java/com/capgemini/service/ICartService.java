package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;

public interface ICartService {
	
	public int  addCartItem(Product product,int quantity);
	
	public int removeCartItem(Product product,int id);
	
	public int  removefromDb(List<Product> list, int id);// to remove item from db after purchase
	
	public int viewCart(Customer customer,int id);
	
	//public int  updateCartItem(List<Product> list, int id, int quantity);
	
	

	
}
