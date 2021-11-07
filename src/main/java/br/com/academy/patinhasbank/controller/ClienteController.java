package br.com.academy.patinhasbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.service.ClienteService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController implements ControllerImplementacao<Cliente, Integer> {

	@Autowired
	private ClienteService clienteService;	
	

	@Override
	public ResponseEntity<Cliente> insert(Cliente body) {
		log.info("Inserindo um novo Cliente");		
		return ResponseEntity.ok().body(clienteService.insert(body));
	}

	@Override
	public ResponseEntity<List<Cliente>> findAll() {
		log.info("Buscando Todos os Clientes ");
		return ResponseEntity.ok().body(clienteService.findAll());
	}

	@Override
	public ResponseEntity<Cliente> findbyId(@PathVariable Integer id) {		
		Cliente client = clienteService.findById(id);
		return ResponseEntity.ok().body(client);

	}

}
