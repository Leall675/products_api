package com.leall.produtosapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.leall.produtosapi.entity.Produto;
import com.leall.produtosapi.repository.ProdutoRepository;

@Service
public class ProdutoService {
  
  //@Autowired
  private ProdutoRepository produtoRepository;

  public ProdutoService(ProdutoRepository produtoRepository) {
    this.produtoRepository = produtoRepository;
  }

  public List<Produto> getAllProducts() {
    return produtoRepository.findAll();
  }

  public Produto getIdProduct(Long id) {
    return produtoRepository.findById(id).orElse(null);
  }

  public Produto addProduct(Produto produto) {
    return produtoRepository.save(produto);
  }

  public void deleteProduct(Long id) {
    produtoRepository.deleteById(id);
  }

  public Produto updateProduct(Long id, Produto produto) {
    produto.setId(id);
    return produtoRepository.save(produto);
  }

}
