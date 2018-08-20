package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.InvoiceView;
import com.capgemini.model.OrderDetails;
import com.capgemini.model.Product;
import com.capgemini.repository.InvoiceRepository;

@Service("service")
public class GenerateInvoiceServiceImpl implements GenerateInvoiceService {

	@Autowired(required = true)
	InvoiceRepository repository;
	int flag = 0;

	public GenerateInvoiceServiceImpl(InvoiceRepository repository2) {
		this.repository = repository2;
	}

	@Override
	public List<InvoiceView> generate_invoice(int order_id)
			throws OrderDetailsNotFoundException, ProductNotFoundException {

		List<InvoiceView> invoice = new ArrayList<InvoiceView>();
		OrderDetails order1 = repository.findById(order_id);

		if (order1 == null)
			throw new OrderDetailsNotFoundException();

		List<Product> product = order1.getProduct();
		if (product == null)
			throw new ProductNotFoundException();

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
		return invoice;
	}

}
