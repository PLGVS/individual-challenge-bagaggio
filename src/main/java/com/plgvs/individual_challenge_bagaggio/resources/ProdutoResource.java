package com.plgvs.individual_challenge_bagaggio.resources;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import com.plgvs.individual_challenge_bagaggio.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
