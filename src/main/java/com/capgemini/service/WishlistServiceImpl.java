package com.capgemini.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;
import com.capgemini.model.WishList;
import com.capgemini.repository.WishListCustomer;
import com.capgemini.repository.WishListProductRepository;
import com.capgemini.repository.WishlistRepository;

@Component
public class WishlistServiceImpl implements WishlistService {
	@Autowired
	WishlistRepository repo;
	@Autowired
	WishListProductRepository repoprod;
	@Autowired
	WishListCustomer repocust;
	@Override
	public Product addItem(int pid,int custid) {
		Product product=repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		WishList wishlist=repo.getOne(customer.getWishList().getId());
		List<Product> prod=wishlist.getProduct();
		prod.add(product);
		wishlist.setProduct(prod);
		repo.save(wishlist);
		return product;
	}

  

	@Override
	public void add(int custid) {
		Customer customer = repocust.getOne(custid);
		WishList wishlist=new WishList();
		repo.save(wishlist);
		customer.setWishList(repo.getOne(wishlist.getId()));
		repocust.save(customer);
		
	}



	@Override
	public void removeItem(int pid, int custid) {
		Product product=repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		WishList wishlist=repo.getOne(customer.getWishList().getId());
		List<Product> prod=wishlist.getProduct();
		prod.remove(product);
		wishlist.setProduct(prod);
		
		repo.save(wishlist);
	}
	@Override
	public WishList display(int custid) {
		Customer customer = repocust.getOne(custid);
		return repo.getOne(customer.getWishList().getId());
	}



	

}
