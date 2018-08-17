package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.model.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {
	@Query(value="select o from OrderDetails o where o.id=?1")
	public OrderDetails getOrderDetails(int id);
}
