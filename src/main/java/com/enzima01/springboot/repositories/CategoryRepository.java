package com.enzima01.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzima01.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
