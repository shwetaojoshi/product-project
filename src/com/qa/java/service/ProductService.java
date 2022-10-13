package com.qa.java.service;

import java.util.Comparator;
import java.util.List;

import com.qa.java.bean.Product;
import com.qa.java.repository.ProductRepository;

public class ProductService {

	ProductRepository proRepository;

	public ProductService() {

		proRepository = new ProductRepository();
	}

	// Get the Product details
	public List<Product> getProducts() {
		return proRepository.getProducts();
	}

	// getproductwith highest price

	
	  public Product getProductWithHighestPrice() { return
	  getProducts().stream()
	  .max(Comparator.comparing(Product::getPrice)).get();
	  
	  }
	  
	  public List<Product> getProductSortedByName() {
		  return getProducts().stream().sorted(Comparator.comparing(Product::getName)).toList();
	  }
	 
	
	
	/*
	 * public void prodMaxPrice(){ System.out.println(getProducts().stream()
	 * .max(Comparator.comparing(Product::getPrice)) .get()); }
	 */
}
