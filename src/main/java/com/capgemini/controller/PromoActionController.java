package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.exception.PromoCodeNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;
import com.capgemini.service.PromoDisplayService;

@RestController
public class PromoActionController {
	@Autowired(required=true)
	private PromoDisplayService promoServices;
	
	@RequestMapping(value="/applyPromo",method=RequestMethod.GET)
	public  List<PromoCode> applyPromo() throws PromoCodeNotFoundException {
		try {
			List<PromoCode> list =promoServices.promoDisplay();	
			return list;
		} catch (PromoCodeNotFoundException e) {
			throw new PromoCodeNotFoundException("PromoCode Not available");
		}
		
	}
	@RequestMapping(value="/newProduct",method=RequestMethod.GET)
	public  List<Product> newProduct() throws ProductNotFoundException {
		try {
			List<Product> list =promoServices.newProductsDisplay();	
			return list;
		} catch (ProductNotFoundException e) {
			throw new ProductNotFoundException("No new Products are available");
		}
		
	}


}
