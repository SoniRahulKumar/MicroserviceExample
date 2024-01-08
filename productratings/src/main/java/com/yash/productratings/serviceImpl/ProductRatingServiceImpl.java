package com.yash.productratings.serviceImpl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productratings.controller.ProductRatingController;
import com.yash.productratings.dao.ProductRatingDao;
import com.yash.productratings.model.Rating;
import com.yash.productratings.service.ProductRatingService;

@Service
public class ProductRatingServiceImpl implements ProductRatingService{

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductRatingServiceImpl.class);
	
	@Autowired
	private ProductRatingDao productRatingDao;
	
	public Rating getRatingById(int id) {
		logger.info("Inside ProductRatingServiceImpl");
		return  productRatingDao.getRatingById(id);
	}

}
