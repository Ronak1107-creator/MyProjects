package com.example.product.dto;

public class Productdto {
	private Long id;
	private String name;
	private String description;
	private double price;
	private Long categoryId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public Productdto(Long id, String name, String description, double price, long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
	}
	public Productdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
