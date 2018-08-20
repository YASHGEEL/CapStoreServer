package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.model.Merchant;

public interface MerchantValidateService {

	public Merchant merchantValidation(Merchant merchant);
	public List<Merchant> getMerchantDetails() throws MerchantNotFoundException;
}


