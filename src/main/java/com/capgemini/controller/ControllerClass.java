package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.SearchNotFoundException;
import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.service.SearchService;

@RestController
public class ControllerClass {

	@Autowired
	SearchService service;

	@RequestMapping(value = "/searchproductbyname")
	public List<Product> search_Product_By_Name(String sname) throws Exception {
		List<Product> list11;
		// try {
		list11 = service.searchProductByName(sname);
		if (list11.isEmpty())
			System.out.println("No SEARCH CASES FOUND");
		else {
			System.out.println("something");
			return list11;
		}
		/*
		 * catch(SearchNotFoundException e) { System.out.println(e.getMessage()); return
		 * null; }
		 * 
		 */
		return null;

	}

	@RequestMapping(value = "/searchproductbybrand")
	public List<Product> search_Product_By_Brand(String sname) throws SearchNotFoundException {
		List<Product> list11;
		// try {
		list11 = service.searchProductByBrand(sname);
		return list11;
		// }
		/*
		 * catch(SearchNotFoundException e) { System.out.println(e.getMessage()); return
		 * null; }
		 * 
		 */

	}

	@RequestMapping(value = "/searchproductbycategory")
	public List<Product> search_Product_By_Category(String sname) throws SearchNotFoundException {
		List<Product> list11;
		// try {
		list11 = service.searchProductBycategory(sname);
		return list11;
		// }
		/*
		 * catch(SearchNotFoundException e) { System.out.println(e.getMessage()); return
		 * null; }
		 * 
		 */

	}

	@RequestMapping(value = "/searchmerchant")
	public Merchant search_By_Merchant(String sname) throws SearchNotFoundException {
		Merchant merchant;

		merchant = service.searchMerchant(sname);
		return merchant;
	}

	@RequestMapping(value = "/searchcustomer")
	public Customer search_By_customer(String sname) throws SearchNotFoundException {
		Customer customer;

		customer = service.searchCustomer(sname);
		return customer;
	}

}
