package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.OrderRepository;

@Service
public class DeliveryProductsServiceImpl implements DeliveryProductsService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public OrderDetails deliveringProducts(int id) {
		// TODO Auto-generated method stub
		
		
		OrderDetails orderDetails=orderRepository.deliveringProducts(id);
		if(orderDetails.getStatus().equalsIgnoreCase("delivered")) {
			List<Product> deliverproduct=orderDetails.getProduct();
		for(Product product:deliverproduct) {
			int qty=product.getQuantity()-1;
			product.setQuantity(qty);
			
		}
		return orderRepository.save(orderDetails);
		}
		
		else {
			
			return orderDetails;
		}
	
	}

}
