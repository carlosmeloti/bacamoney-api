package br.com.qosdesenvolvimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qosdesenvolvimentos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
