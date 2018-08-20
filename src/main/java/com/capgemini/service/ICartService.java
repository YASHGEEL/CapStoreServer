package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.Cart;
//import com.capgemini.model.Customer;
import com.capgemini.model.Product;

public interface ICartService {

	public Product addCartItem(int pid, int custid);

	public void addCart(int custid);

	public void removeCartItem(int pid, int custid);

	public Cart viewCart(int custid);

	public Boolean minAmountCheck(int custid);

}
