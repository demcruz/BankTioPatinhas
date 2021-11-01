package br.com.academy.patinhasbank.DTO;

import br.com.academy.patinhasbank.entity.Cliente;
import lombok.Data;

@Data
public class ClienteDTO {
	
	private Integer idCliente;
	
	private String nome;
	
	private String cpf;
	
	private String password;

	public ClienteDTO(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.password = cliente.getPassword1();
	}
	
	
	
	
	

}
