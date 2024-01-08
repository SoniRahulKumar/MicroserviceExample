package com.yash.productdetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="product_details_entity")
@Data
public class ProductDetailsEntity {
	
	@Id
	private int id;
	private String name;
	
	public ProductDetailsEntity() {
		super();
	}
	
	public ProductDetailsEntity(int id, String name) {
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
