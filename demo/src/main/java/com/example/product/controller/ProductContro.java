package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.Productdto;
import com.example.product.service.Productservice;

@RestController
@RequestMapping("/api/products")
public class ProductContro {
	
	@Autowired
	Productservice p;
	@PostMapping
	public Productdto p3(@RequestBody Productdto p4) {
		return p.createP(p4);
	}
	@GetMapping
	public List<Productdto> p(){
		return p.pt();
		
		
	}
	@GetMapping("/{id}")
	public Productdto p4(@PathVariable Long id) {
		return p.pt1(id);
	}
	
	@PutMapping("/{id}")
	public Productdto p5(@PathVariable Long id,@RequestBody Productdto dt) {
		return p.pt3(id, dt);
		
	}
	@DeleteMapping("/{id}")
	public String del(@PathVariable Long id) {
		return p.delt(id);
		
	}
	
	
	
	

}
