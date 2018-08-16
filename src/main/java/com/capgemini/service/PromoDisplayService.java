package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.exception.PromoCodeNotFoundException;
import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;

public interface PromoDisplayService {
	public abstract List<PromoCode> promoDisplay() throws PromoCodeNotFoundException ;
	public abstract List<Product> newProductsDisplay() throws ProductNotFoundException;
}
