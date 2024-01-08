package com.yash.productdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.productdetails.entity.ProductDetailsEntity;

public interface ProductDetailsRepository extends JpaRepository<ProductDetailsEntity, Integer> {

}
