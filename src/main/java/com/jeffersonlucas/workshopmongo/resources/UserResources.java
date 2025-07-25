package com.jeffersonlucas.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffersonlucas.workshopmongo.domain.User;
import com.jeffersonlucas.workshopmongo.dto.UserDTO;
import com.jeffersonlucas.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	//O CONTROLADOR ACESSA O SERVICE .
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		
		List<User> list =service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
	    User user = service.findbyId(id);
	    UserDTO userDto = new UserDTO(user);
	    return ResponseEntity.ok().body(userDto);
	}

	
	
	
}
