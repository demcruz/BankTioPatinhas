package br.com.academy.patinhasbank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRANSACOES")
public class Transacoes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDTRANSACAO")
	private Integer idTransacao;

	@Column(name = "CONTAORIGEM")
	private Integer contaOrigem;

	@Column(name = "CONTADESTINO")
	private Integer contaDestino;

	@Column(name = "VALORTRANSACAO")
	private BigDecimal valorTransacao;

	@Column(name = "DATATRANSACAO")
	@CreationTimestamp
	private LocalDateTime dataTransacao;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDCONTA")
	private Conta conta;

}
