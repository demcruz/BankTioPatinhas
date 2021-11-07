package br.com.academy.patinhasbank.DTO;

import java.math.BigDecimal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaEntreContasDTO {

	private Integer numeroDaContaOrigem;

	private Integer numeroDaContaDestinatario;

	private BigDecimal valorTransferencia;
	
	private String mensagem;







}
