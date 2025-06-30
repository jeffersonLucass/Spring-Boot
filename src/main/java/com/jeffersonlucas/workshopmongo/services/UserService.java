package com.jeffersonlucas.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffersonlucas.workshopmongo.domain.User;
import com.jeffersonlucas.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	//O SERVICE ACESSA O REPOSITORY QUE É RESPÓNSAVEL POR ENTRAR EM CONTATO COM O BD.
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
}
