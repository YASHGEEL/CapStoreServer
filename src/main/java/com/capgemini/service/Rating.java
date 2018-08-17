package com.capgemini.service;

import com.capgemini.model.Product;

public interface Rating {

	public int getFb(int fId);

	public float setAvgRating(int pId);

	public float getAvgRating(int pId);

	public float getMerchantAvgRating(int mId);

	//public Product setRating(int pId);

	

}
