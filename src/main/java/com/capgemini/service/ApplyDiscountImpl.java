package com.capgemini.service;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Discount;
import com.capgemini.model.Product;
import com.capgemini.repository.DiscountRepo;
import com.capgemini.repository.DiscountRepo2;

@Service
public class ApplyDiscountImpl implements ApplyDiscountInterface {
	@Autowired
	DiscountRepo repo;
	@Autowired
	DiscountRepo2 repo2;

	@Override
	public Product discountDB(int id, Discount discount) {
		Product product = repo2.getOne(id);
		discount.setStartTime(Date.valueOf(LocalDate.now()));
		discount = repo.save(discount);
		product.setDiscount(discount); /* product.setdiscount(discount.getId) */
		repo2.save(product);
		return product;
	}

}
