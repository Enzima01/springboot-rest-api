package com.enzima01.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzima01.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
