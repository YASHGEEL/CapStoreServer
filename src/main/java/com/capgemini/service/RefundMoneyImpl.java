package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;
import com.capgemini.repository.OrderDetailsRepository;
import com.capgemini.repository.RefundMoneyRepository;

@Service
public class RefundMoneyImpl implements RefundMoney{
	@Autowired
	RefundMoneyRepository repo;
	@Override
	public String refundDisplay(int id) {
		OrderDetails o= repo.refundDisplay(id);
		
		if(o.getStatus().equalsIgnoreCase("RETURNED"))	{
			o.setStatus("REFUNDED");
			repo.save(o);
			return "Refund Successful";
		}	
		else if(o.getStatus().equalsIgnoreCase("REFUNDED")) {
			return "Refund done Already";
		}
		else if(o.getStatus().equalsIgnoreCase("Delivered")) {
			return "Delivered Successfully";
		}
			
		else return "Sorry,Product is not Delivered. You are not Eligible for Refund";

	}

}
