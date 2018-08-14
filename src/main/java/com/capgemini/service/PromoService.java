package com.capgemini.service;

import com.capgemini.model.Product;
import com.capgemini.model.PromoCode;

public interface PromoService {
public abstract PromoCode promoDisplay(PromoCode promocode) ;
public abstract Product newProductsDisplay(Product product);
}
