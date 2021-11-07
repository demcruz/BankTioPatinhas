package br.com.academy.patinhasbank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CONTA")
public class Conta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6283392013950645824L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCONTA")
	private Integer idConta;

	@Column(name = "NUMERODACONTA")
	private Integer numeroDaConta;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPODECONTA")
	private TipoDeConta tipoDeConta;

	@Column(name = "SALDOCONTA")
	private BigDecimal saldoConta;


	@OneToMany(mappedBy = "conta", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Transacoes> transacoes;

}
