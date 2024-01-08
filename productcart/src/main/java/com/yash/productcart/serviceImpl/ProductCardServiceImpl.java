package com.yash.productcart.serviceImpl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.productcart.dao.ProductCardDao;
import com.yash.productcart.daoImpl.ProductCardDaoImpl;
import com.yash.productcart.model.Card;
import com.yash.productcart.service.ProductCardService;

@Service
public class ProductCardServiceImpl implements ProductCardService{
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductCardServiceImpl.class);
	
	@Autowired
	private ProductCardDao productCardDao;

	public List<Card> getCardById(Long id) {
		logger.info("inside ProductCardService");
		return productCardDao.getCardById(id);
	}

}
