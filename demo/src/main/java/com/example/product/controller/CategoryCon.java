package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.Categorydto;
import com.example.product.service.Categoryservice;

@RestController
@RequestMapping("/api/categories")
public class CategoryCon {
	@Autowired
	private Categoryservice ct;
	
	@PostMapping
	public Categorydto tr(@RequestBody Categorydto ar) {
		 return ct.createCate(ar);
		
		
	}
	@GetMapping
	public List<Categorydto> c1(){
		return ct.act();
		
		
	}
	@GetMapping("/{id}")
	public Categorydto c2(@PathVariable Long id) {
		return ct.byId(id);
		
	}
	@DeleteMapping("/{id}")
	public String delecat(@PathVariable Long id) {
		return ct.del(id);
		
	}

}
