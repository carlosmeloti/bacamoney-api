package br.com.qosdesenvolvimentos.repository;


import br.com.qosdesenvolvimentos.model.Lancamento;
import br.com.qosdesenvolvimentos.repository.lancamento.LancamentoRepositoryQuery;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
