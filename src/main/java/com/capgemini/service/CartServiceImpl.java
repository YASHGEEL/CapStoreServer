package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Cart;
import com.capgemini.model.Customer;
import com.capgemini.model.Product;
import com.capgemini.repository.CartCustomer;
import com.capgemini.repository.CartProductRepository;
import com.capgemini.repository.CartRepository;


@Service
public class CartServiceImpl implements ICartService {
	
	@Autowired
	CartRepository repo;
	@Autowired
	CartProductRepository repoprod;
	@Autowired
	CartCustomer repocust;

	/*@Override
	public Product addCartItem(int pid, int custid,int quantity) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		Cart cart = repo.getOne(customer.getCart().getId());
		List<Product> prod = cart.getProduct();
		prod.add(product);
		cart.setProduct(prod);
		cart.setQuantity(cart.getQuantity()+quantity);
		cart.setStartTime(Date.valueOf(LocalDate.now()));
		repo.save(cart);
		return product;

	}*/
	
	@PersistenceContext
	  private EntityManager em;
	
	@Override
	public Product addCartItem(int pid, int custid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		Cart cart = repo.getOne(customer.getCart().getId());
		List<Product> prod = cart.getProduct();
		
		prod.add(product);
		cart.setProduct(prod);
		cart.setQuantity(cart.getQuantity() + 1);
		//product.setQuantity(product.getQuantity()-1);
		
		cart.setStartTime(Date.valueOf(LocalDate.now()));
		repo.save(cart);
		
		return product;

	}

	@Override
	public void addCart(int custid) {
		Customer customer = repocust.getOne(custid);
		Cart cart = new Cart();
		repo.save(cart);
		customer.setCart(repo.getOne(cart.getId()));
		repocust.save(customer);

	}

	@Override
	public void removeCartItem(int pid, int custid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		Cart cart = repo.getOne(customer.getCart().getId());
		List<Product> prod = cart.getProduct();
		prod.remove(product);
		cart.setProduct(prod);
		cart.setQuantity(cart.getQuantity() - 1);
		repo.save(cart);
	}

	@Override
	public Cart viewCart(int custid) {
		Customer customer = repocust.getOne(custid);
		return repo.getOne(customer.getCart().getId());
	}

	@Override
	public Boolean minAmountCheck(int custid) {
		Customer customer = repocust.getOne(custid);
		Cart cart = repo.getOne(customer.getCart().getId());
		List<Product> prod = cart.getProduct();
		float amount = 0;
		for (Product product : prod) {
			amount += product.getCost();
		}
		if (amount > 100) {
			return true;
		} else {
			return false;
		}
	}

}
