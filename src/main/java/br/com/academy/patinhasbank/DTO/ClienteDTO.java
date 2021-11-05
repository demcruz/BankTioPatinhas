package br.com.academy.patinhasbank.DTO;

import java.util.List;

import br.com.academy.patinhasbank.entity.Cliente;
import br.com.academy.patinhasbank.entity.Conta;
import lombok.Data;

@Data
public class ClienteDTO {
	
	private Integer idCliente;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	private String password;
	
	private List<Conta> conta;

	public ClienteDTO(Cliente cliente, Conta conta) {
		this.idCliente = cliente.getIdCliente();
		this.nome = cliente.getNome();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();
		this.password = cliente.getPassword1();
		this.conta.add(conta);
	}
	
	
	
	
	

}
