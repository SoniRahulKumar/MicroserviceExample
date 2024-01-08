package com.yash.productratings.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productratings.model.Rating;
import com.yash.productratings.service.ProductRatingService;

@RestController
@RequestMapping("/api/productRating")
public class ProductRatingController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductRatingController.class);

	@Autowired
	private ProductRatingService productRatingService;

	@GetMapping("/getRatingById/{id}")
	public Rating getRatingById(@PathVariable("id") int id) {
		logger.info("Inside ProductRatingController");
		return productRatingService.getRatingById(id);
	}
}
