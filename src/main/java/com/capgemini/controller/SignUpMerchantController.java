package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.model.Merchant;
import com.capgemini.service.signUpMerchant;

@RestController
public class SignUpMerchantController {
	@Autowired(required = true)
	public signUpMerchant service2;
	

	@RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
	public String addMerchant(@RequestBody Merchant merchant) {
		String str = service2.addMerchant(merchant);	
		return str;
	}
	
	@RequestMapping(value = "/displayMerchantDetails", method = RequestMethod.GET)
	public Merchant displayMerchant(@RequestParam("id") int id) {
		Merchant mer = service2.findMerchantByid(id);
		return mer;
	}
	
}
