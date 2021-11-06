package br.com.academy.patinhasbank.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

	
	@Autowired
	private ContaService contaService;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Conta>> getContaId(@PathVariable Integer id){
		return ResponseEntity.ok().body(contaService.findById(id));		
	}
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<Conta>>findAll(){
		return ResponseEntity.ok().body(contaService.findAll());
	}
	
	public Optional<Conta> findByNumeroConta(@PathVariable Integer numerodaConta) {
		return contaService.findByNumeroConta(numerodaConta);
	}
	
	
	@PostMapping(value = "/transferenciaContas")
	public Conta transferenciaEntreContas (@RequestBody TransferenciaEntreContasDTO transfer){		
		
		Optional<Conta> contaOrigem = findByNumeroConta(transfer.getNumeroDaContaOrigem());
		Conta origem = contaOrigem.get();		
		
		Optional<Conta> contaDestino = contaService.findByNumeroConta(transfer.getNumeroDaContaDestinatario());
		Conta destino = contaDestino.get();
		
		
		System.out.println("Saldo da conta de origem " + origem.getSaldoConta());
		System.out.println("Saldo da conta de destino " + destino.getSaldoConta());
		
		BigDecimal saldoContaOrigem = origem.getSaldoConta().subtract(transfer.getValorTransferencia());
		BigDecimal saldoContaDestino = origem.getSaldoConta().add(transfer.getValorTransferencia());
		
		origem.setSaldoConta(origem.getSaldoConta().subtract(transfer.getValorTransferencia()));
		destino.setSaldoConta(origem.getSaldoConta().add(transfer.getValorTransferencia()));
		System.out.println("Saldo conta Origem depois Transação" + saldoContaOrigem);		
		System.out.println("Saldo conta Destino depois Transação" + saldoContaDestino);
		contaService.update(origem);
		contaService.update(destino);

		return origem;
	}
	
	
}
