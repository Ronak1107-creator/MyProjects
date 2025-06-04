package com.example.product.mapper;

import com.example.product.dto.Productdto;
import com.example.product.entity.category;
import com.example.product.entity.product;

public class ProductMap {
	public static product dtotoproduct(Productdto p,category c) {
		product p1 = new product();
		p1.setName(p.getName());
		p1.setDescription(p.getDescription());
		p1.setPrice(p.getPrice());
		p1.setCt(c);
		return p1;
		
	}
	public static Productdto producttodto(product p) {
		return new Productdto(p.getId(),p.getName(),p.getDescription(),p.getPrice(),p.getCt().getId());
		
	}
	
	

}
