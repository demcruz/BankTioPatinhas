package br.com.academy.patinhasbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.academy.patinhasbank.entity.Transacoes;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacoes, Integer>{

}
