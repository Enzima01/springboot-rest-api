package com.enzima01.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzima01.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
