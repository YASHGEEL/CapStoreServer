package com.capgemini.service;

import java.util.List;

import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.model.Merchant;

public interface MerchantValidateService {

	public List<Merchant> merchantValidation(List<Merchant> merchantList);
	public List<Merchant> getMerchantDetails() throws MerchantNotFoundException;
}


