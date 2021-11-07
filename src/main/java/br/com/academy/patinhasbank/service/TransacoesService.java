package br.com.academy.patinhasbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.entity.Transacoes;
import br.com.academy.patinhasbank.exceptions.EntityNotFoundException;
import br.com.academy.patinhasbank.repository.TransacaoRepository;

@Service
public class TransacoesService implements ServiceImplementacao<Transacoes, Integer> {

	@Autowired
	TransacaoRepository transacaoRepository;

	@Override
	public List<Transacoes> findAll() {
		return transacaoRepository.findAll();
	}

	@Override
	public Transacoes insert(Transacoes body) {
		return transacaoRepository.save(body);
	}

	@Override
	public Transacoes findById(Integer id) {
		return transacaoRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Trnsação numero" + id + "não encontrada"));
		
		
	}

}
