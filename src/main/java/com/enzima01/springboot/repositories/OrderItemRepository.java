package com.enzima01.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzima01.springboot.entities.OrderItem;
import com.enzima01.springboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
