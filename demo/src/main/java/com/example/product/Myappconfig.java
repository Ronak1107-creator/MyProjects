package com.example.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Myappconfig {
	@Bean
	public Mycomponent component() {
		return new Mycomponent();
	}

}
