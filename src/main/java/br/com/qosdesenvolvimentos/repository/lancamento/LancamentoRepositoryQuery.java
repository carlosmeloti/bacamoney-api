package br.com.qosdesenvolvimentos.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.qosdesenvolvimentos.model.Lancamento;
import br.com.qosdesenvolvimentos.repository.filter.LancamentoFilter;
import br.com.qosdesenvolvimentos.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	

}
