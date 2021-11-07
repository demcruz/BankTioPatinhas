package br.com.academy.patinhasbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.patinhasbank.entity.Transacoes;
import br.com.academy.patinhasbank.service.TransacoesService;

@RestController
@RequestMapping(value = "/historicoTransacoes")
public class TransacoesController {
	
	@Autowired
	private TransacoesService transacoesService;
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<Transacoes>> findAll(){
		return ResponseEntity.ok().body(transacoesService.findAll());
	}
	
	@GetMapping(value = "/findById")
	public ResponseEntity<Transacoes> findById(@PathVariable Integer id){
		return ResponseEntity.ok().body(transacoesService.findById(id));
	}

}
