package com.yash.productdetails.serviceImpl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productdetails.dao.ProductDetailsDao;
import com.yash.productdetails.daoImpl.ProductDetailsDaoImpl;
import com.yash.productdetails.model.ProductDetails;
import com.yash.productdetails.service.ProductDetailsService;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService{
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDetailsDaoImpl.class);
	
	@Autowired
	private ProductDetailsDao productDetailsDao;

	public List<ProductDetails> getProductById(int id) {
		logger.info("Inside ProductDetailsServiceImpl");
		return productDetailsDao.getProductById(id);
	}

}
