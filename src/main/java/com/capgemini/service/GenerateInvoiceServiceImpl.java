package com.capgemini.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.InvoiceView;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.InvoiceRepository;

@Service("service")
public class GenerateInvoiceServiceImpl implements GenerateInvoiceService {

	@Autowired(required = true)
	InvoiceRepository repository;

	@Override
	public List generate_invoice(int order_id)  {

		List<InvoiceView> invoice = new ArrayList();
		List<OrderDetails> order = repository.getOrderDetails();
		for (OrderDetails order1 : order) {				
			if (order1.getId() == order_id) {
				List<Product> product = order1.getProduct();
				for (Product product1 : product) {
					InvoiceView invView = new InvoiceView();
					invView.setOrderId(order1.getId());
					invView.setOrderAmount(order1.getAmount());
					invView.setOrderQuantity(order1.getQuantity());
					invView.setProdId(product1.getId());
					invView.setProductName(product1.getName());
					invView.setProductBrand(product1.getBrand());
					invView.setProductCost(product1.getCost());
					invView.setDiscountedPrice(product1.getDiscount().getDiscountedPrice());
					invView.setCustName(order1.getCustomer().getName());
					invView.setCustAddress(order1.getCustomer().getAddress());
					invoice.add(invView);
				}
			}
			
		}

		return invoice;
	}

}
