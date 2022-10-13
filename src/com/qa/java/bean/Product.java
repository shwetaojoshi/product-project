package com.qa.java.bean;

import java.io.Serializable;

public class Product implements Serializable {
	
	private int id ;
	private String name ;
	private float price;
	
	
	public int getId() {
		return id;
	}
	public Product setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Product setName(String name) {
		this.name = name;
		return this;
	}
	
	
	
	public float getPrice() {
		return price;
	}
	public Product setPrice(float price) {
		this.price = price;
		return this;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
