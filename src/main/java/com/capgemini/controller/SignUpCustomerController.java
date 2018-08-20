package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.model.Customer;
import com.capgemini.model.Product;
import com.capgemini.repository.WishlistRepository;
import com.capgemini.service.ICartService;
import com.capgemini.service.WishlistService;
import com.capgemini.service.signUpCustomer;

@RestController
public class SignUpCustomerController {
	@Autowired(required=true)
	public signUpCustomer service1;
	
	@Autowired
	ICartService iCart;
	
	@Autowired
	WishlistService wish;
	
	
	@RequestMapping(value = "/addCustomer",method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		
		String str = service1.addCustomer(customer);
		if(str==null) {
		iCart.addCart(customer.getId());
		wish.addwish(customer.getId());
		}
		return str;
	}
	
}
