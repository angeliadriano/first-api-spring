package com.firstapiadriano.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstapiadriano.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Adriano Angeli", "adrianoangeli01@gmail.com", "99999999", "123");
		return ResponseEntity.ok().body(u);	
	}
	
}
