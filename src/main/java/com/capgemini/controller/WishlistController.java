package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Product;
import com.capgemini.model.WishList;
import com.capgemini.service.WishlistService;

@RestController
public class WishlistController {
  
	@Autowired
	WishlistService service;
	
	@RequestMapping(value="/addItem")
	public Product addProduct(int pid,int cid)
	{
		return service.addItem(pid,cid);
	}
	@RequestMapping(value="/removeItem")
	public void delProduct(int pid,int cid)
	{
		 service.removeItem(pid,cid);
	}
	@RequestMapping(value="/add")
	public void add(int cid)
	{
		service.add(cid);
	}
	@RequestMapping(value="/display")
	public WishList display(int cid)
	{
		return service.display(cid);
	}
} 
