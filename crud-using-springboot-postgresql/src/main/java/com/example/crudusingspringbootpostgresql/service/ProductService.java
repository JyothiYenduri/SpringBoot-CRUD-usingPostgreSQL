package com.example.crudusingspringbootpostgresql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudusingspringbootpostgresql.repository.ProductRepository;
import com.example.crudusingspringbootpostgresql.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pr;
	
	public List<Product> getAllProducts() {
        return pr.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return pr.findById(id);
    }

    public Product saveProduct(Product product) {
        return pr.save(product);
    }

    public void deleteProduct(int id) {
        pr.deleteById(id);
    }
}
