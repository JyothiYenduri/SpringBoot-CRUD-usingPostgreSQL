package com.example.crudusingspringbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudusingspringbootpostgresql.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
