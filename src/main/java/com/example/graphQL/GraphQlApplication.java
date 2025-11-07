package com.example.graphQL;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.graphQL.entity.Product;
import com.example.graphQL.repo.ProductRepo;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class GraphQlApplication {
	/*
	 * @Autowired private ProductRepo productRepo;
	 * 
	 * @PostConstruct public void initDB() { List<Product> products =
	 * (List<Product>) Stream.of( new Product("Laptop","Electronics",8000.99f,2),
	 * new Product("Laptop","Electronics",8000.99f,2), new
	 * Product("Laptop","Electronics",8000.99f,2), new
	 * Product("Laptop","Electronics",8000.99f,2)).collect(Collectors.toList());
	 * productRepo.saveAll(products);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);
	}

}
