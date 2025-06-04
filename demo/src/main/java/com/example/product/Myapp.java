package com.example.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Myapp {
	private Mycomponent com;
	@Autowired
	public Myapp(Mycomponent a) {
		this.com = a;
	}
	public void run() {
		com.getMsg();
	}
	
}
