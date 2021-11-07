package br.com.academy.patinhasbank.service;

import java.math.BigDecimal;
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
	//!(transfer.getValorTransferencia().compareTo(origem.getSaldoConta()) > 0)

	@Override
	public Cliente insert(Cliente body) {
		body.getConta().forEach((value -> {
			
			if(value.getSaldoConta().equals(0.00))		
					System.out.println("não pode");
					
		}));
		
		
		return clienteRepository.save(body);
	}

	public Cliente findById(Integer id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Cliente Não Encontrado" + id));
	}

}
