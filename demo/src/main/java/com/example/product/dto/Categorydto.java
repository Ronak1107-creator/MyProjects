package com.example.product.dto;

import java.util.ArrayList;
import java.util.List;

public class Categorydto {
	private Long id;
	private String name;
	List<Productdto> list = new ArrayList<>();
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
	public List<Productdto> getList() {
		return list;
	}
	public void setList(List<Productdto> list) {
		this.list = list;
	}
	public Categorydto(Long id, String name, List<Productdto> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	public Categorydto() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
