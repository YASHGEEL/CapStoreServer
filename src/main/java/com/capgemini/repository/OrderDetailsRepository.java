package com.capgemini.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.model.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails,Integer>{

	@Query("select orderDetails from OrderDetails orderDetails where orderDetails.id=?1")
	OrderDetails findByOrderId(int id);
	
}
