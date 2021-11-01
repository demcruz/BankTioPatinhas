package br.com.academy.patinhasbank.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2823685053470748124L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCLIENTE")
	private Integer idCliente;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD1")
	private String password1;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Conta> conta;

}
