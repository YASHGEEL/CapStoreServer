package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.model.OrderDetails;

public interface InvoiceRepository extends JpaRepository<OrderDetails, Integer> {

	public OrderDetails findById(int orderId);
}
