package com.yash.productcart.daoImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Repository;

import com.yash.productcart.controller.ProductCardController;
import com.yash.productcart.dao.ProductCardDao;
import com.yash.productcart.entity.CardEntity;
import com.yash.productcart.model.Card;
import com.yash.productcart.repository.ProductCardRepository;

@Repository
public class ProductCardDaoImpl implements ProductCardDao{

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductCardDaoImpl.class);
	
	@Autowired
	private ProductCardRepository productCardRepository;
	
	public List<Card> getCardById(Long id) {
		logger.info("inside ProductCardDaoImpl");
		List<Card> productCards = new ArrayList<Card>();
		
		CardEntity entity = productCardRepository.findById(id).get();
		Card productCard = new Card();
		productCard.setId(entity.getId());
		productCard.setName(entity.getName());
		productCard.setColure(entity.getColure());
		productCard.setDiscription(entity.getDiscription());
		productCard.setPrice(entity.getPrice());
		productCards.add(productCard);
		return productCards;
	}

}
