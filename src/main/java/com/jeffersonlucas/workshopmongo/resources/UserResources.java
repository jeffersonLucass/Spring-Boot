package com.jeffersonlucas.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffersonlucas.workshopmongo.domain.User;
import com.jeffersonlucas.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	//O CONTROLADOR ACESSA O SERVICE .
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list =service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
