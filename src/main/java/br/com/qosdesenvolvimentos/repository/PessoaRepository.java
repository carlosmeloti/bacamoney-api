package br.com.qosdesenvolvimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qosdesenvolvimentos.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
