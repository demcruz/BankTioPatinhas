package br.com.academy.patinhasbank.DTO;




import java.io.Serializable;
import java.math.BigDecimal;



import br.com.academy.patinhasbank.entity.TipoDeConta;
import lombok.Data;

@Data
public class ClienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;

	private String cpf;
	
	private String email;

	private String password1;
	
	private Integer numeroDaConta;

	private TipoDeConta tipoDeConta;

	private BigDecimal saldoConta;
	
	
	
	
	

}
