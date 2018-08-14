package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;

public interface PromoDisplayService {
	public abstract List<PromoCode> promoDisplay();
	public abstract List<Product> newProductsDisplay();
}
