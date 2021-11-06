package br.com.academy.patinhasbank.exception;



public class ContaException extends RuntimeException  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8692056353385724826L;

	public ContaException(Integer id) {
		super("Não ha conta com esse numero");
	}

}
