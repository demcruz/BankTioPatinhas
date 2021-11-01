package br.com.academy.patinhasbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javassist.tools.rmi.ObjectNotFoundException;

public interface ControllerImplementacao<T, R> {
	
	
	@PostMapping(value = "/insert")
	public ResponseEntity<T> insert (@RequestBody T body) throws ObjectNotFoundException;
	
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<T>> listarTodos();

	
	@GetMapping(value = "findById/{id}")
	public ResponseEntity <Optional<T>> findbyId(@PathVariable Integer id);

	@PutMapping(value = "/upadate/{id}")
	public ResponseEntity<T> update(@PathVariable R id, @RequestBody T body) throws ObjectNotFoundException;
}
