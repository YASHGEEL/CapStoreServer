package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.Customer;
import com.capgemini.model.Merchant;
import com.capgemini.model.Product;
import com.capgemini.repository.ISearchRepo;
import com.capgemini.repository.ISearchRepo1;
import com.capgemini.repository.ISearchRepo2;

@Service("service")

public class SearchServiceImpl implements SearchService {

	@Autowired(required = true)
	ISearchRepo repo;

	@Autowired(required = true)
	ISearchRepo1 repo1;

	@Autowired(required = true)
	ISearchRepo2 repo2;

	@Override
	public List<Product> searchProductByName(String searchString) {

		List<Product> list1 = repo2.findProductbyName(searchString);

		if (list1.isEmpty())
			return null;
		else
			return list1;
	}

	@Override
	public List<Product> searchProductByBrand(String searchString) {

		List<Product> list2 = repo2.findProductbyBrand(searchString);

		return list2;
	}

	@Override
	public List<Product> searchProductBycategory(String searchString) {
		List<Product> list3 = repo2.findProductbyCategory(searchString);
		return list3;
	}

	@Override
	public Merchant searchMerchant(String searchString) {
		Merchant merchant = repo1.findMerchant(searchString);
		return merchant;
	}

	@Override
	public Customer searchCustomer(String sname) {
		Customer customer = repo.findCustomer(sname);
		return customer;
	}

}
