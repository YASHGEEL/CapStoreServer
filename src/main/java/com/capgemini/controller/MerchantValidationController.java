package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.MerchantNotFoundException;
import com.capgemini.model.Merchant;
import com.capgemini.service.MerchantValidateService;

@RestController
public class MerchantValidationController {

	@Autowired(required=true)
	private MerchantValidateService validateService;
	
	@RequestMapping(value="/recieveMerchant",method=RequestMethod.POST)
	public List<Merchant> recieveMerchant(@RequestBody List<Merchant> merchant) {
		List<Merchant> merchantList=validateService.merchantValidation(merchant);
	    return merchantList;
	}
    
	@RequestMapping(value="/merchant")
	public List<Merchant> getMerchant() throws MerchantNotFoundException{
		List<Merchant> list=validateService.getMerchantDetails();
		return list;
		
	}
}


