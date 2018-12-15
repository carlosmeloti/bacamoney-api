package br.com.qosdesenvolvimentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qosdesenvolvimentos.model.Lancamento;
import br.com.qosdesenvolvimentos.model.Pessoa;
import br.com.qosdesenvolvimentos.repository.LancamentoRepository;
import br.com.qosdesenvolvimentos.repository.PessoaRepository;
import br.com.qosdesenvolvimentos.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
			if (pessoa == null || pessoa.isInativo()) {
				throw new PessoaInexistenteOuInativaException();
			}
		
		return lancamentoRepository.save(lancamento);
	}

}
