package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.OrderDetailsRepository;

@Service
public class ProductReturnServiceImpl implements ProductReturnService {

	@Autowired
	OrderDetailsRepository orderDetailsRepo;
	
	/*@Override
	public OrderDetails returnOrder(int orderId) {
		
		 OrderDetails o=orderDetailsRepo.findByOrderId(orderId);
		 
		 if(o.getStatus().equalsIgnoreCase("DELIVERED"))
		 {
			 o.setStatus("RETURNED");
		 
		 List<Product> returningProducts=o.getProduct();
		 for (Product product : returningProducts)
		 {
			 int quantity=product.getQuantity()+1;
			 product.setQuantity(quantity);
			 
			//System.out.println(product);
			 
		 }
		 }
		 return orderDetailsRepo.save(o);
		  
	}*/

	@Override
	public OrderDetails returnProduct(int orderId,int productId) throws OrderDetailsNotFoundException {
		
		OrderDetails o=orderDetailsRepo.findByOrderId(orderId);
		int count=0;
		int count1=0;
		String s=o.getStatus();
		if(!s.equalsIgnoreCase("Delivered")&&!s.equalsIgnoreCase("Returned"))
		count1=Integer.valueOf(o.getStatus().substring(9,10));
		if(!s.equalsIgnoreCase("RETURNED"))
		{
			List<Product> returningProducts=o.getProduct();
			 	for (Product product : returningProducts)
			 	{
			 		if(product.getId()==productId)
			 		{
			 			
			 			int quantity=product.getQuantity()+1;
			 			product.setQuantity(quantity);
			 			count++;
			 			break;
			 		}
			 	}
			 	int count3=count+count1;
			 	if(count3==o.getQuantity())
			 	{
			 		o.setStatus("RETURNED");
			 	}
			 	
			 	else 
			 	{
				 o.setStatus("RETURNED "+count3+" Products");
			 	}
			 	return orderDetailsRepo.save(o);
			}
		
		return null;
		
	}
	

}