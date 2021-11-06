package br.com.academy.patinhasbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.service.ClienteService;
import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController implements ControllerImplementacao<Cliente, Integer> {

	@Autowired
	private ClienteService clienteService;
	
	@Override
	public ResponseEntity<Cliente> insert(Cliente body) {
		return ResponseEntity.ok().body(clienteService.insert(body));
	}

	@Override
	public ResponseEntity<List<Cliente>> listarTodos() {
		return ResponseEntity.ok().body(clienteService.findAll()); 
	}

	@Override
	public ResponseEntity<Optional<Cliente>> findbyId(Integer id) {
		return null;
	}

	

}
