package br.com.academy.patinhasbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.DTO.TransferenciaEntreContasDTO;
import br.com.academy.patinhasbank.entity.Conta;
import br.com.academy.patinhasbank.exceptions.EntityNotFoundException;
import br.com.academy.patinhasbank.repository.ContaRepository;
import br.com.academy.patinhasbank.repository.TransacaoRepository;

@Service
public class ContaService implements ServiceImplementacao<Conta, Integer> {

	@Autowired
	private ContaRepository contaRepository;
	
	@Autowired
	TransacaoRepository transacaoRepository;

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
		TransferenciaEntreContasDTO tranferSucess = new TransferenciaEntreContasDTO();

		Conta origem = findByNumeroConta(transfer.getNumeroDaContaOrigem());
		Conta destino = findByNumeroConta(transfer.getNumeroDaContaDestinatario());	
		
		if(!(transfer.getValorTransferencia().compareTo(origem.getSaldoConta()) > 0)) {
			
			origem.setSaldoConta(origem.getSaldoConta().subtract(transfer.getValorTransferencia()));		
			destino.setSaldoConta(destino.getSaldoConta().add(transfer.getValorTransferencia()));		
			atualizaSaldo(origem);
			atualizaSaldo(destino);
			tranferSucess.setNumeroDaContaOrigem(origem.getNumeroDaConta());
			tranferSucess.setNumeroDaContaDestinatario(destino.getNumeroDaConta());
			tranferSucess.setValorTransferencia(transfer.getValorTransferencia());
			tranferSucess.setMensagem("Tranferencia Realizada Com Sucesso");
			
			return tranferSucess; 
		}else {
			tranferSucess.setNumeroDaContaOrigem(origem.getNumeroDaConta());
			tranferSucess.setNumeroDaContaDestinatario(destino.getNumeroDaConta());
			tranferSucess.setValorTransferencia(transfer.getValorTransferencia());
			tranferSucess.setMensagem("Saldo Insuficiente");
		}
		
		return tranferSucess;
			
		
	}	
	

	public Conta atualizaSaldo(Conta conta) {
		return contaRepository.save(conta);
	}

}
