package com.qa.java.main;

import java.util.List;

import com.qa.java.bean.Product;
import com.qa.java.service.ProductService;

public class Main {

	public static void main(String[] args) {

		System.out.println("inside main new project");
		ProductService productService = new ProductService();
		productService.getProducts();

		System.out.println("Product with max price is : " + productService.getProductWithHighestPrice());
		// productService.prodMaxPrice();

		List<Product> products = productService.getProductSortedByName();
		
		products.stream().forEach(System.out::println);
	}

}
