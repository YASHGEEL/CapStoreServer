package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Product;
import com.capgemini.model.WishList;

public interface WishlistService {
	
public Product addItem(int pid,int custid);
	
	public void add(int custid);
	
	public void removeItem(int pid,int custid);
	
	public WishList display(int custid);
	   

}
