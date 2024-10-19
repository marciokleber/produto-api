package com.github.marciokleber.produtoapi.controller;

import com.github.marciokleber.produtoapi.domain.Produto;
import com.github.marciokleber.produtoapi.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(produtoRepository.findById(id).orElseThrow());
    }

    @PostMapping
    public ResponseEntity<Produto> create(@Valid @RequestBody Produto newProduto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(newProduto));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") Long id, @Valid @RequestBody Produto updateProduto) {
        var p = produtoRepository.findById(id).orElseThrow();
        System.out.println(p);
        BeanUtils.copyProperties(updateProduto, p, "id");
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(p));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        produtoRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
