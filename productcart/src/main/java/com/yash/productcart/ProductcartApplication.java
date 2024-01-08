package com.yash.productcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class ProductcartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductcartApplication.class, args);
	}

}
