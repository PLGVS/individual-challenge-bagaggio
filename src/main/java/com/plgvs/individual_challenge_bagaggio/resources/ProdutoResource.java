package com.plgvs.individual_challenge_bagaggio.resources;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import com.plgvs.individual_challenge_bagaggio.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> produtos = produtoService.findAll();

        return ResponseEntity.ok().body(produtos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
        Produto produto = produtoService.findById(id);

        return ResponseEntity.ok().body(produto);
    }

    @PostMapping
    public ResponseEntity<Produto> insert(@RequestBody Produto produto){
        produto = produtoService.insert(produto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();

        return ResponseEntity.created(uri).body(produto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto){
        Produto obj = produtoService.update(id, produto);

        return ResponseEntity.ok().body(obj);
    }
}
