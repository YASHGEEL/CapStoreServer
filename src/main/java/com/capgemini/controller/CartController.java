package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Cart;
import com.capgemini.model.Product;
import com.capgemini.service.ICartService;

@RestController
public class CartController {

	@Autowired
	ICartService service;

	@RequestMapping(value = "/addCartItem", method=RequestMethod.GET)
	
	public String addProduct(int pid, int cid) {
	 service.addCartItem(pid, cid);
	 return "Added to cart";
	}

	@RequestMapping(value = "/removeCartItem")
	public void delProduct(int pid, int cid) {
		service.removeCartItem(pid, cid);
	}

	@RequestMapping(value = "/addCart")
	public void addProduct(int cid) {
		service.addCart(cid);
	}

	@RequestMapping(value = "/viewCart")
	public Cart viewCart(int cid) {
		return service.viewCart(cid);
	}

	@RequestMapping(value = "/minAmountCheck")
	public Boolean amountCheck(int cid) {
		return service.minAmountCheck(cid);
	}

}
