package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.service.Rating;
import com.capgemini.service.signUpMerchant;

@RestController
public class SignUpMerchantController {
	@Autowired(required = true)
	public signUpMerchant service2;
	@Autowired
	Rating rate;

	@RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
	public String addMerchant(@RequestBody Merchant merchant) {

		String str = service2.addMerchant(merchant);
		
		
		return str;

	}

}
