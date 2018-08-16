package com.capgemini.service;


import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.exception.PromoCodeNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;
import com.capgemini.repository.ProductRepository;
import com.capgemini.repository.PromoRepository;

@Component(value="promoServices")
public class PromoServiceImpl implements PromoDisplayService{
	@Autowired
PromoRepository promo;
	@Autowired
	ProductRepository product;
	@Override
	public List<PromoCode> promoDisplay() throws PromoCodeNotFoundException{
		//List list=new ArrayList();
		// LocalDate date=LocalDate.now();
		List<PromoCode> list=promo.newPromos();
		return list;
	}

	@Override
	public List<Product> newProductsDisplay() throws ProductNotFoundException{
		System.out.println("true");
	    LocalDate date=LocalDate.now();
	    Date date1=Date.valueOf(date);
	    date=date.minusDays(3);
	    System.out.println(date1);
	   // List productList=new ArrayList();
	   List<Product> productList=product.newProducts(date1);
		return productList;
	}

}
