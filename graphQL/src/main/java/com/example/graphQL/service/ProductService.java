package com.example.graphQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphQL.entity.Product;
import com.example.graphQL.exception.ResourceNotFoundException;
import com.example.graphQL.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	public List<Product> getProductsByCategory(String category) {

		List<Product> products = productRepo.findByCategory(category);
		if (products.isEmpty()) {
			throw new ResourceNotFoundException("No products found for category: " + category);
		}
		return products;

	}

	// update the stock of product

	public Product updateStock(int id, int stock) {
		Product existingProduct = productRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id:" + id));
		existingProduct.setStock(stock);
		return productRepo.save(existingProduct);
	}

	// receive new stock update

	public Product receiveNewStock(int id, int quantity) {
		Product existingProduct = productRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id:" + id));
		existingProduct.setStock(existingProduct.getStock() + quantity);
		return productRepo.save(existingProduct);
	}

}
