package com.capgemini.service;

import com.capgemini.model.Product;
import com.capgemini.model.WishList;

public interface WishlistService {
	public abstract WishList add(Product product);
	
	public abstract WishList remove(Product product);
	
	public abstract WishList display();

}
