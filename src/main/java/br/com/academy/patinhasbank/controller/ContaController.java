package br.com.academy.patinhasbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.patinhasbank.DTO.TransferenciaEntreContasDTO;
import br.com.academy.patinhasbank.entity.Conta;
import br.com.academy.patinhasbank.service.ContaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/conta")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Conta> getContaId(@PathVariable Integer id){
		return ResponseEntity.ok().body(contaService.findById(id));		
	}
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<Conta>>findAll(){
		return ResponseEntity.ok().body(contaService.findAll());
	}	
	
	@PostMapping(value = "/transferenciaContas")
	public ResponseEntity<TransferenciaEntreContasDTO> transferenciaEntreContas (@RequestBody TransferenciaEntreContasDTO transfer){		
		log.info("Tranferencia entre Contas Iniciada");		
		return ResponseEntity.ok().body(contaService.transferencia(transfer));
	}
	
	@GetMapping(value = "/numeroDaConta/{id}")
	public Conta findByNumeroConta(@PathVariable Integer numerodaConta) {
		return contaService.findByNumeroConta(numerodaConta);
	}
	
	
}
