package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.OrderDetails;
@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,Integer> {
	@Query(value="select o from OrderDetails o where o.id=?1")
	OrderDetails deliveringProducts(int id);

	}

