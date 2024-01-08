package com.yash.productcart.dao;

import java.util.List;

import com.yash.productcart.model.Card;

public interface ProductCardDao {

	List<Card> getCardById(Long id);
}
