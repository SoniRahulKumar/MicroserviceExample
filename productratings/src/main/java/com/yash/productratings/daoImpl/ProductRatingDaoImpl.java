package com.yash.productratings.daoImpl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.productratings.dao.ProductRatingDao;
import com.yash.productratings.entity.RatingEntity;
import com.yash.productratings.model.Rating;
import com.yash.productratings.repository.productratingRepository;

@Repository
public class ProductRatingDaoImpl implements ProductRatingDao {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductRatingDaoImpl.class);

	@Autowired
	private productratingRepository productratingRepository;
	
	public Rating getRatingById(int id) {
		logger.info("Inside ProductRatingDaoImpl");
		/*
		 * List<Rating> productRatings = Arrays.asList(new Rating(1, "Exceed"), new
		 * Rating(2, "Comendable"), new Rating(3, "Mad Expectation"), new Rating(4,
		 * "PIP"));
		 * 
		 * Rating ratingObj = productRatings.stream().filter((i) -> i.getId() ==
		 * id).findAny().get();
		 */
		
		RatingEntity entity = productratingRepository.findById(id).get();
		Rating rating = new Rating();
		rating.setId(entity.getId());
		rating.setRatingName(entity.getRatingName());
		
		return rating;
	}

}
