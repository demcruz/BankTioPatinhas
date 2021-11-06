package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.entity.Conta;
import br.com.academy.patinhasbank.exception.ContaException;
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
	public Optional<Conta> findById(Integer id) {
		Optional<Conta> contaId = contaRepository.findById(id);
		if (!contaId.isPresent())
			throw new ContaException(id);
		return contaId;
	}

	public Optional<Conta> findByNumeroConta(Integer numeroConta) {
		Optional<Conta> numeroContaDb = contaRepository.findByNumeroDaConta(numeroConta);
// 		if(!numeroContaDb.isPresent()) {
//			return numeroContaDb;
//		}
		return numeroContaDb;
	}
	
	public Conta update(Conta conta) {
		return contaRepository.save(conta);
	}

}
