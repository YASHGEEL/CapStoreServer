package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.CategoryNotFoundException;
import com.capgemini.exception.ProductNotFoundException;
import com.capgemini.model.IDisplayProductUtil;
import com.capgemini.service.DisplayProductService;

@RestController
public class DisplayProductController {

	@Autowired
	DisplayProductService service;

	@RequestMapping(value = "/showProducts")
	public List<IDisplayProductUtil> displayProducts(@RequestParam(value = "id", required = false) int id) {
		List<IDisplayProductUtil> list = null;

		try {

			list = service.displayProducts(id);
		}

		catch (ProductNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (CategoryNotFoundException e) {
			System.err.println(e.getMessage());
		}

		return list;
	}

}
