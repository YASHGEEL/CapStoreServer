package com.capgemini.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Cart;
import com.capgemini.model.Product;
import com.capgemini.repository.CartRepository;

@Service
public class DiscountServiceImpl implements DiscountService {
	@Autowired
	CartRepository cartrepositry;

	public Cart discountCalculation(int id) {
		Cart cart = cartrepositry.getProductInCart(id);
		System.out.println(cart);
		List<Product> list1 = cart.getProduct();
		for (Product product : list1) {
			int discount = product.getDiscount().getDiscountPercentage();
			float discount1 = (float) (0.01 * discount);
			float product1 = product.getCost();
			product.getDiscount().setDiscountedPrice(product1 - (product1 * discount1));
		}
		cartrepositry.save(cart);
		return cart;
	}

}
