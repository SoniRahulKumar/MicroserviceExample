package com.yash.productcart.service;

import java.util.List;

import com.yash.productcart.model.Card;

public interface ProductCardService {

	List<Card> getCardById(Long id);

}
