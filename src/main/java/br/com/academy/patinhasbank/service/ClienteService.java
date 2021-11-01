package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.repository.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente update(Integer id, Cliente body) throws ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
