package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.model.OrderDetails;

public interface RefundMoneyRepository extends JpaRepository<OrderDetails,Integer>{
	
@Query(value="select o from OrderDetails o where o.id=?1")
public OrderDetails refunddisplay(@Param("id")int id);

}
