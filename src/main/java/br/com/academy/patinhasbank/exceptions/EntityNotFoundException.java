package br.com.academy.patinhasbank.exceptions;

public class EntityNotFoundException extends RuntimeException {
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 756950243997047740L;

	public EntityNotFoundException(String msg) {
		super(msg);
	}
}
