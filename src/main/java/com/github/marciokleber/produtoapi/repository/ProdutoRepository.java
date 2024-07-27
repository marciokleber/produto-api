package com.github.marciokleber.produtoapi.repository;

import com.github.marciokleber.produtoapi.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
