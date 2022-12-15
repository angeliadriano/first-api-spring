package com.firstapiadriano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapiadriano.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
