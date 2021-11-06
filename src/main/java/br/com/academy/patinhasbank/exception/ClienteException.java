package br.com.academy.patinhasbank.exception;

public class ClienteException  extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3039730597436095836L;

	public ClienteException(Integer id) {
		super("Não ha Cliente com esse numero");
	}

}
