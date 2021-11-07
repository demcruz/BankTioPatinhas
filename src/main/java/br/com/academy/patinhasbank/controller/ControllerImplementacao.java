package br.com.academy.patinhasbank.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface ControllerImplementacao<T, R> {
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<T> insert (@RequestBody T body);
	
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<T>> findAll();

	
	@GetMapping(value = "findById/{id}")
	public ResponseEntity <T> findbyId(@PathVariable Integer id);



}
