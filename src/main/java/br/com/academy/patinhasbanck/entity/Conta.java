package br.com.academy.patinhasbanck.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTA")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCONTA")
	private Integer idConta;
	
	private Integer numeroDaConta;
//	
//	@Enumerated(EnumType.STRING)
//	private TipoDeConta tipoDeConta;
	
	private BigDecimal saldoConta;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Cliente cliente;
	
	
	//private List<Transacoes> transacoes;
	
	
}
