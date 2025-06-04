package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.product.dto.Categorydto;
import com.example.product.entity.category;
import com.example.product.mapper.CategoryMap;
import com.example.product.repos.CateRepo;
@Component
public class Categoryservice {
	@Autowired
	CateRepo c1;
	public Categorydto createCate(Categorydto dto) {
		category c = CategoryMap.dtoToCat(dto);
		c = c1.save(c);
	return	CategoryMap.catTodto(c);
		
		
		
		
		
	}
	public List<Categorydto> act(){
		return c1.findAll().stream().map(CategoryMap :: catTodto).toList();
	}
	
	public Categorydto byId(Long id) {
		category dt = c1.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
		return CategoryMap.catTodto(dt);
	}
public String del(Long id) {
	c1.deleteById(id);
	return "Categoty "+id+" has been deleted";
}
}