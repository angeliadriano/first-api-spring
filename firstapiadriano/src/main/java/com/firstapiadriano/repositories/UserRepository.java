package com.firstapiadriano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstapiadriano.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
