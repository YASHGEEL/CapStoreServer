package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.exception.OrderDetailsNotFoundException;
import com.capgemini.model.OrderDetails;
import com.capgemini.service.GenerateInvoiceService;
@RestController
public class InvoiceController {
	
	@Autowired
	GenerateInvoiceService service;
	
	@RequestMapping(value="/get")
	public String startPage()
	{
		return "Hello World";
	}

	@RequestMapping(value="/invoice")
	public List myFunct(@RequestParam(value="id",required=false)int id) throws OrderDetailsNotFoundException
	{
		return service.generate_invoice(id);
	}
}
