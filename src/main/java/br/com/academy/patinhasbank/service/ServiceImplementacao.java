package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;


public interface ServiceImplementacao<T, R> {

	public List<T> findAll();
	
	public T insert(T body);
	
	public T findById(R id);
	
}
