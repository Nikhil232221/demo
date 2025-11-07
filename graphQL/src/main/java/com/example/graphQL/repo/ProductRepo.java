package com.example.graphQL.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphQL.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String category);

}
