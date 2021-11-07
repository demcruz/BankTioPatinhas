package br.com.academy.patinhasbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.academy.patinhasbank.DTO.TransferenciaEntreContasDTO;
import br.com.academy.patinhasbank.entity.Conta;
import br.com.academy.patinhasbank.exceptions.EntityNotFoundException;
import br.com.academy.patinhasbank.repository.ContaRepository;

@Service
public class ContaService implements ServiceImplementacao<Conta, Integer> {

	@Autowired
	private ContaRepository contaRepository;

	@Override
	public List<Conta> findAll() {
		return contaRepository.findAll();
	}

	@Override
	public Conta insert(Conta body) {
		return contaRepository.save(body);
	}

	@Override
	public Conta findById(Integer id) {	
		return contaRepository.findById(id).orElseThrow(() -> 
		new EntityNotFoundException("Conta id numero " + id + "não encontrada")
				) ;
	}

	public Conta findByNumeroConta(Integer numeroConta) {
		return contaRepository.findByNumeroDaConta(numeroConta)
				.orElseThrow(() -> new EntityNotFoundException("Numero de conta não Existe " + numeroConta));
	}
	
	public TransferenciaEntreContasDTO transferencia(TransferenciaEntreContasDTO transfer) {
		Conta origem = findByNumeroConta(transfer.getNumeroDaContaOrigem());
		Conta destino = findByNumeroConta(transfer.getNumeroDaContaDestinatario());	
		
		origem.setSaldoConta(origem.getSaldoConta().subtract(transfer.getValorTransferencia()));		
		destino.setSaldoConta(destino.getSaldoConta().add(transfer.getValorTransferencia()));		
		atualizaSaldo(origem);
		atualizaSaldo(destino);
		TransferenciaEntreContasDTO tranferSucess = new TransferenciaEntreContasDTO();
		tranferSucess.setNumeroDaContaOrigem(origem.getNumeroDaConta());
		tranferSucess.setNumeroDaContaDestinatario(destino.getNumeroDaConta());
		tranferSucess.setValorTransferencia(tranferSucess.getValorTransferencia());
		tranferSucess.setMensagem("Tranferencia Realizada Com Sucesso");		
		return tranferSucess; 
	}	
	

	public Conta atualizaSaldo(Conta conta) {
		return contaRepository.save(conta);
	}

}
