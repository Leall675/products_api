package com.leall.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leall.produtosapi.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  
}
