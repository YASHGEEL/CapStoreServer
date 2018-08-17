package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.service.RefundMoney;

@RestController
public class RefundController {
@Autowired
RefundMoney service;
@RequestMapping(value="/refunddisplay")
public String refundDisplay(int id )
{
	String status = service.refundDisplay(id); 
     return status;
}
}

