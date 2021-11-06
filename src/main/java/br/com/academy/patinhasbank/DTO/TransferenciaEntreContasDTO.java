package br.com.academy.patinhasbank.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TransferenciaEntreContasDTO {

	@JsonProperty("numeroDaContaOrigem")
	private Integer numeroDaContaOrigem;

	@JsonProperty("numeroDaContaDestinatario")
	private Integer numeroDaContaDestinatario;

	@JsonProperty("valorTransferencia")
	private BigDecimal valorTransferencia;

	public TransferenciaEntreContasDTO() {
		super();
	}

	public TransferenciaEntreContasDTO(Integer numeroDaContaOrigem, Integer numeroDaContaDestinatario,
			BigDecimal valorTransferencia) {
		super();
		this.numeroDaContaOrigem = numeroDaContaOrigem;
		this.numeroDaContaDestinatario = numeroDaContaDestinatario;
		this.valorTransferencia = valorTransferencia;
	}

//	public TransferenciaEntreContasDTO(Conta conta) {
//		this.numeroDaContaOrigem = conta.getNumeroDaConta();
//		this.numeroDaContaDestinatario = conta.getNumeroDaConta();
//		this.valorTransferencia = conta.getSaldoConta();
//	
//
//	}

}
