package com.yash.productratings.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="rating_entity")
@Data
public class RatingEntity {

	@Id
	private int id;
	private String ratingName;
	
	public RatingEntity() {
		super();
	}
	public RatingEntity(int id, String ratingName) {
		super();
		this.id = id;
		this.ratingName = ratingName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRatingName() {
		return ratingName;
	}

	public void setRatingName(String ratingName) {
		this.ratingName = ratingName;
	}
	
}
