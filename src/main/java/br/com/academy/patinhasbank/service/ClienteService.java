package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.DTO.ClienteDTO;
import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.entity.Conta;
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

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
