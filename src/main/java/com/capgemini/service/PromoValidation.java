package com.capgemini.service;


public interface PromoValidation {

	public String ValidatingPromo(int orderId,String promoname);
	public String RemovePromo(int orderId, String promoname);
}
