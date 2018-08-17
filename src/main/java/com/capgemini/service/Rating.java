package com.capgemini.service;

public interface Rating {

	public int getFb(int fId);

	public float setAvgRating(int pId);

	public float getAvgRating(int pId);

	public float getMerchantAvgRating(int mId);

}
