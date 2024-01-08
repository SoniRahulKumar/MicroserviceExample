package com.yash.productdetails.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productdetails.model.ProductDetails;
import com.yash.productdetails.service.ProductDetailsService;

@RestController
@RequestMapping("/api/productDetails")
public class ProductDetailsController {

	/*
	 * @LoadBalanced
	 * 
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 * 
	 * @Autowired private RestTemplate restTemplate;
	 */

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDetailsController.class);

	@Autowired
	private ProductDetailsService productDetailsService;

	@GetMapping("/getProductById/{id}")
	public List<ProductDetails> getProductById(@PathVariable("id") int id) {
		logger.info("Inside ProductDetailsController");
		return productDetailsService.getProductById(id);
	}

}
