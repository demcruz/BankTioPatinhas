package br.com.academy.patinhasbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.academy.patinhasbank.entity.Conta;



@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	@Query(value = "SELECT * FROM CONTA where numeroDaConta = ? " , nativeQuery = true)
	Optional<Conta>findByNumeroDaConta(@Param("numeroDaConta") Integer numeroDaConta);

}
