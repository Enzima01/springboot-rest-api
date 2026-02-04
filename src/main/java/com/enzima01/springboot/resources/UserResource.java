package com.enzima01.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enzima01.springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Enzo", "enzo@gmail.com", "19989043521", "123");
		return ResponseEntity.ok().body(u);
	}

}
