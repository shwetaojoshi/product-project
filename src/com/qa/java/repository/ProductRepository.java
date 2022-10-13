package com.qa.java.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.qa.java.bean.Product;
import com.qa.java.util.CsvReader;

public class ProductRepository {
	
	List<Product> empList;
	
	
	public ProductRepository () {
		
		CsvReader csv = new CsvReader();
		empList = csv.getProductFromCsv();
	}
	
	public List<Product> getProducts(){
		return this.empList;
	}
	
	
}


