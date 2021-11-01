package br.com.academy.patinhasbank.service;

import java.util.List;
import java.util.Optional;

import javassist.tools.rmi.ObjectNotFoundException;

public interface ServiceImplementacao<T, R> {

	public List<T> findAll();
	
	public T insert(T body);
	
	public Optional<T>findById(R id);
	
	public T update(R id, T body) throws ObjectNotFoundException;
}
