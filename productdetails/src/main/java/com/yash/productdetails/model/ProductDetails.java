package com.yash.productdetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ProductDetails {
	private int id;
	private String name;
	
	public ProductDetails() {
		super();
	}

	public ProductDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
