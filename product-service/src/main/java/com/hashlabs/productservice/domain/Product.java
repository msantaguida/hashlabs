package com.hashlabs.productservice.domain;

import org.springframework.data.annotation.Id;

public class Product {

	@Id
	private String id;
	
	private String title;
	
	private String description;
	
	private Integer price;
	
	private Discount discount;

	public Product(String title, String description, Integer price) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
}
