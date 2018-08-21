package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.model.Merchant;
import com.capgemini.service.ManagingMerchantService;
@RestController
public class ManageMerchantController {

	@Autowired 
	ManagingMerchantService service;
	
	@RequestMapping(value="/AddMerchant",method=RequestMethod.POST)
	public void merchantAddition(@RequestBody Merchant merchant)
	{
		service.AddMerchant(merchant);
	}
	
	@RequestMapping(value="/UpdateMerchant",method=RequestMethod.POST)
	public void merchantUpdation(@RequestBody Merchant merchant)
	{
		service.UpdateMerchant(merchant);
	}
	@RequestMapping(value="/DeleteMerchant")
	public void merchantUpdation(int id)
	{
		service.DeleteMerchant(id);
	}
	@RequestMapping(value="/DisplayMerchant")
	public List<Merchant> merchantDisplay()
	{
		return service.displayMerchant();
	}
	@RequestMapping(value="/DisplayApprovedMerchant")
	public List<Merchant> merchantApprovedDisplay()
	{
		return service.displayApprovedMerchant();
	}
	
	
}
