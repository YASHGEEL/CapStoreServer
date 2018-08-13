package com.capgemini.service;

import com.capgemini.model.Customer;
import com.capgemini.model.OrderDetails;

public interface RefundMoney {
public String moneyRefund(OrderDetails order,Customer customer);
}
