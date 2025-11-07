package com.example.graphQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.graphQL.entity.Product;
import com.example.graphQL.service.ProductService;
//GraphQL Controller
@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@QueryMapping
	public List<Product> getAllProduct(){
		return productService.getProducts();
	}
	
	@QueryMapping
	public List<Product> getProductByCategory(@Argument String category){
		return productService.getProductsByCategory(category);
	}
	
	@MutationMapping
	public Product updateStock(@Argument int id,@Argument int stock) {
		return productService.updateStock(id, stock);
		
	}
	
	@MutationMapping
	public Product receiveNewShipment(@Argument int id, @Argument int quantity) {
		return productService.receiveNewStock(id, quantity);
	}

}
