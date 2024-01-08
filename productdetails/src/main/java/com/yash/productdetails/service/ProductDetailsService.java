package com.yash.productdetails.service;

import java.util.List;

import com.yash.productdetails.model.ProductDetails;

public interface ProductDetailsService {
	public List<ProductDetails> getProductById(int id);
}
