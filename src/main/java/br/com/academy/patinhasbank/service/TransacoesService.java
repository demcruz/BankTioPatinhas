package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.entity.Transacoes;
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
	public Optional<Transacoes> findById(Integer id) {
		Optional<Transacoes> transacoesDb = transacaoRepository.findById(id);
		if (!transacoesDb.isPresent()) {
			return null;
		}
		return transacoesDb;
	}

}
