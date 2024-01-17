package com.generation.lojagames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public Optional<Produto> findAllById(Long id);
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(@Param("nomeProduto")String nomeProduto);
}
