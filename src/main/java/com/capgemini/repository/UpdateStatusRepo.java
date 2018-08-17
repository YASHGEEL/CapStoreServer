package com.capgemini.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.OrderDetails;
@Repository
public interface UpdateStatusRepo extends JpaRepository<OrderDetails,Integer>  {

	

	
@Query("select order.status from OrderDetails order where order.id=?1")
	public String displayDeliveryStatus(int order_id);
}
