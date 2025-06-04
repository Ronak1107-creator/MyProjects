package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.product.dto.Productdto;
import com.example.product.entity.category;
import com.example.product.entity.product;
import com.example.product.mapper.ProductMap;
import com.example.product.repos.CateRepo;
import com.example.product.repos.ProductRepo;
@Component
public class Productservice {
	@Autowired
	ProductRepo p2;
	@Autowired
	CateRepo c2;
	public Productdto createP(Productdto p) {
	category c4  = 	c2.findById(p.getCategoryId()).orElseThrow(() -> new RuntimeException("page not found"));
	product p1 = 	ProductMap.dtotoproduct(p,c4);
	 p1 = p2.save(p1);
	return ProductMap.producttodto(p1);
		
		
	}
	public List<Productdto> pt(){
		return p2.findAll().stream().map(ProductMap :: producttodto).toList();
	}
	public Productdto pt1(Long id) {
		product p = p2.findById(id).orElseThrow(() -> new RuntimeException("id notr found"));
		return ProductMap.producttodto(p);
	}
public Productdto pt3(Long id,Productdto a) {
	product p1 = p2.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
	category c = c2.findById(a.getCategoryId()).orElseThrow(() -> new RuntimeException("id1 not found"));
	p1.setName(a.getName());
	p1.setDescription(a.getDescription());
	p1.setPrice(a.getPrice());
	p1.setCt(c);
	p2.save(p1);
	return ProductMap.producttodto(p1);
	
	
}
public String delt(Long id) {
	p2.deleteById(id);
	return id + "has been deleted";
}
}
