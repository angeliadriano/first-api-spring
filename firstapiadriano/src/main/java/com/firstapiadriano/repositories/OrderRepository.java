package com.firstapiadriano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapiadriano.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
