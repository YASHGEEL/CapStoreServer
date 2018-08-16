package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;


import com.capgemini.model.Product;
import com.capgemini.repository.CartRepository;


public class CartServiceImpl  implements ICartService {

	CartRepository repo;
	
	public CartServiceImpl(CartRepository repo) {
		this.repo=repo;
	}

	@Override
	public Product addCartItem(int i) {
		
		return null;
	}

	@Override
	public Product removeCartItem(Product product, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product removefromDb(List<Product> list, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> viewCart( int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateCartItem(List<Product> list, int id, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByProductID(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
