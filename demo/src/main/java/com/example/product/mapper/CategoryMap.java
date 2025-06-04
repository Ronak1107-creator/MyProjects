package com.example.product.mapper;

import com.example.product.dto.Categorydto;
import com.example.product.entity.category;

public class CategoryMap {
	public static category dtoToCat(Categorydto dt) {
		category c = new category();
		c.setCate(dt.getName());
		return c;
		
	}
	public static Categorydto catTodto(category c) {
		if(c == null) {
			return null;
		}
		Categorydto a = new Categorydto();
		a.setId(c.getId());
		a.setName(c.getCate());
		a.setList(c.getProduct1().stream().map(ProductMap :: producttodto).toList());
		return a;
		
	}

}
