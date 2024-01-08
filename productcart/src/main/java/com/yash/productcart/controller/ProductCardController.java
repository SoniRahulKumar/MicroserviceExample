package com.yash.productcart.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productcart.model.Card;
import com.yash.productcart.service.ProductCardService;

@RestController
@RequestMapping("/api/productCards")
public class ProductCardController {
	
	@Autowired
	private ProductCardService productCardService;

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductCardController.class);
	 
	@GetMapping(value = "/getCardById/{id}", produces = "application/json")
	public List<Card> getCardById(@PathVariable("id") Long id) {
		logger.info("Inside ProductCardController");
		return productCardService.getCardById(id);
	}

}
