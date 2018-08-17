package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.model.OrderDetails;
@Repository
public interface RefundMoneyRepository extends JpaRepository<OrderDetails,Integer>{
@Query(value="select o from OrderDetails o where o.id=?1")
public OrderDetails refundDisplay(int id);

}
