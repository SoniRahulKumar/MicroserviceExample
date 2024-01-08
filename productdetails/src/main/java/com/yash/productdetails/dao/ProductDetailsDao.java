package com.yash.productdetails.dao;

import java.util.List;

import com.yash.productdetails.model.ProductDetails;

public interface ProductDetailsDao {
	
	public List<ProductDetails> getProductById(int id);
}
