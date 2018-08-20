package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;

public interface InvoiceRepository extends JpaRepository<OrderDetails,Integer>{

	//@Query(value="select order.id,order.amount,order.quantity,product.id, product.name, product.brand,product.cost, order.customer.name,order.customer.address from OrderDetails order, Customer customer, Product product where order.id=:order_id AND order.customer.id=customer.id")
	//public List generate_invoice(@Param("order_id")int order_id);
	
	
	//@Query(value="select order.id,order.amount from OrderDetails order where order.id=:order_id")
		//public List<OrderDetails> generate_invoice(@Param("order_id")int order_id);
	
	
	@Query(value="select order from OrderDetails order")
	public List getOrderDetails();
}
