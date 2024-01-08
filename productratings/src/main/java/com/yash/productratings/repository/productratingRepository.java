package com.yash.productratings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.productratings.entity.RatingEntity;

public interface productratingRepository extends JpaRepository<RatingEntity, Integer>{

}
