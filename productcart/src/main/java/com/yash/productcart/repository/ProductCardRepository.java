package com.yash.productcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.productcart.entity.CardEntity;

public interface ProductCardRepository extends JpaRepository<CardEntity, Long>{

}
