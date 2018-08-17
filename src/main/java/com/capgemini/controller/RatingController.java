package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Product;
import com.capgemini.service.Rating;

@RestController
public class RatingController { // implements ErrorController
	@Autowired(required = true)
	private Rating rating;

	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public int get(@RequestParam("fid") int fId) {

		return rating.getFb(fId);

	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public float avgRating(@RequestParam("pid") int pId) {
		System.out.print("Average rating of Product:  ");
		return rating.setAvgRating(pId);

	}

	@RequestMapping(value = "/merchant", method = RequestMethod.GET)
	public float merchantAvgRating(@RequestParam("mid") int mId) {

		return rating.getMerchantAvgRating(mId);

	}

}
