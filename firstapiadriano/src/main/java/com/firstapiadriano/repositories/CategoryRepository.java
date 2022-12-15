package com.firstapiadriano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapiadriano.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
