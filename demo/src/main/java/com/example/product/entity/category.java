package com.example.product.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class category { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
	private String cate;
	
	@OneToMany(mappedBy = "ct", cascade = CascadeType.ALL)
	private List<product> product1 = new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public List<product> getProduct1() {
		return product1;
	}
	public void setProduct1(List<product> product1) {
		this.product1 = product1;
	}
	
	
 

}
