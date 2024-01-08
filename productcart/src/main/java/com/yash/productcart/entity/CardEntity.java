package com.yash.productcart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="card_entity")
@Data
public class CardEntity {

	@Id
	private Long id;
	private String name;
	private double price;
	private String colure;
	private String discription;

	public CardEntity() {
		super();
	}

	public CardEntity(Long id, String name, double price, String colure, String discription) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.colure = colure;
		this.discription = discription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColure() {
		return colure;
	}

	public void setColure(String colure) {
		this.colure = colure;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	

}
