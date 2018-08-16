package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.OrderDetailsRepository;

@Service
public class ProductReturnServiceImpl implements ProductReturnService {

	@Autowired
	OrderDetailsRepository orderDetailsRepo;
	
	@Override
	public OrderDetails returnProduct(int id) {
		
		 OrderDetails o=orderDetailsRepo.findByOrderId(id);
		 
		 if(o.getStatus().equalsIgnoreCase("DELIVERED"))
		 {
			 o.setStatus("RETURNED");
		 }
		 List<Product> returningProducts=o.getProduct();
		 for (Product product : returningProducts)
		 {
			
			 
			 
		 }
		 return orderDetailsRepo.save(o);
		  
	}
	

}
