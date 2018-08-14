package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

//import com.capgemini.model.Customer;
import com.capgemini.model.Product;


public interface ICartService {
	
	public Product addCartItem(int i);
	
	public Product removeCartItem(Product product,int id);
	
	public Product  removefromDb(List<Product> list, int id);// to remove item from db after purchase
	
	public ArrayList<Product> viewCart(int id);//Customer id is used to view cart
	
	public Product  updateCartItem(List<Product> list, int id, int quantity);
	
	
	public Product getProductByProductID(int pid);
	

	
}
