package com.yash.productratings.model;

public class Rating {

	private int id;
	private String ratingName;
	
	public Rating() {
		super();
	}

	public Rating(int id, String ratingName) {
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
