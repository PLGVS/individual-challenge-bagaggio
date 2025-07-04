package com.plgvs.individual_challenge_bagaggio.services;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import com.plgvs.individual_challenge_bagaggio.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto insert(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
}
