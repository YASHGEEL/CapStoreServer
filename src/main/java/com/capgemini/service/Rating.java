package com.capgemini.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.capgemini.model.FeedBack;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;

public interface Rating {

	public int getFb(int pId);

	public float setAvgRating(int pId);

	public List<Product> getProductList(@Param(value = "id") int mId);

}
