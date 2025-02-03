package com.leall.produtosapi.controller;

import com.leall.produtosapi.entity.Produto;
import com.leall.produtosapi.service.ProdutoService;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProdutoController {

    //@Autowired
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> getProduct() {
        return produtoService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Produto getProductId(@PathVariable("id") Long id) {
        return produtoService.getIdProduct(id);
    }

    @PostMapping
    public Produto addProduct(@RequestBody Produto produto) {
        return produtoService.addProduct(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        produtoService.deleteProduct(id);
    }

    @PutMapping("/{id}")
    public Produto update(@PathVariable("id") Long id, @RequestBody Produto produto) {
        return produtoService.updateProduct(id, produto);
    }
}
