package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.FeedBack;

import com.capgemini.service.Rating;

@RestController
public class RatingController { // implements ErrorController
	@Autowired(required = true)
	private Rating rating;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public int get(@RequestParam("id") int pId) {

		return rating.getFb(pId);

		// rating.getFeedback(pId);

	}

	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public float avgRating(@RequestParam("Id") int pId) {

		return rating.setAvgRating(pId);

	}

}
