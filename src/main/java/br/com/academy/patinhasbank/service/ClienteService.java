package br.com.academy.patinhasbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.exceptions.EntityNotFoundException;
import br.com.academy.patinhasbank.repository.ClienteRepository;

@Service
public class ClienteService implements ServiceImplementacao<Cliente, Integer> {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente insert(Cliente body) {
		return clienteRepository.save(body);
	}

	public Cliente findById(Integer id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Cliente Não Encontrado" + id));
	}

}
