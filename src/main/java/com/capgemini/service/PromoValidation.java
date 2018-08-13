package com.capgemini.service;

import com.capgemini.model.PromoCode;

public interface PromoValidation {

	public String ValidatingPromo(float orderAmount,String promoname,PromoCode promocode);

}
