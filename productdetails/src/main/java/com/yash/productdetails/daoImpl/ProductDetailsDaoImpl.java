package com.yash.productdetails.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.productdetails.dao.ProductDetailsDao;
import com.yash.productdetails.entity.ProductDetailsEntity;
import com.yash.productdetails.model.ProductDetails;
import com.yash.productdetails.repository.ProductDetailsRepository;

@Repository
public class ProductDetailsDaoImpl implements ProductDetailsDao{

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDetailsDaoImpl.class);
	
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	public List<ProductDetails> getProductById(int id) {
		
		logger.info("Inside ProductDetailsDaoImpl");
		List<ProductDetails> productDetails = new ArrayList<ProductDetails>();

		ProductDetailsEntity entity = productDetailsRepository.findById(id).get();
		ProductDetails productDetail = new ProductDetails();
		productDetail.setId(entity.getId());
		productDetail.setName(entity.getName());
		productDetails.add(productDetail);
		
		return  productDetails;
	}
}
