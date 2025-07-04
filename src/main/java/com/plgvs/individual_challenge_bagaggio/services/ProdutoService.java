package com.plgvs.individual_challenge_bagaggio.services;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import com.plgvs.individual_challenge_bagaggio.repositories.ProdutoRepository;
import com.plgvs.individual_challenge_bagaggio.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Produto findById(Long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Produto update(Long id, Produto produto){
        try {
            Produto obj = produtoRepository.getReferenceById(id);
            updateData(produto, obj);
            return produtoRepository.save(obj);
        }
        catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }

    public void updateData(Produto produto, Produto obj){
        obj.setNome(produto.getNome());
        obj.setDescricao(produto.getDescricao());
        obj.setPreco(produto.getPreco());
        obj.setQuantidade(produto.getQuantidade());

    }

    public void delete(Long id){
        try {
            if (!produtoRepository.existsById(id)){
                throw new ResourceNotFoundException(id);
            }
            produtoRepository.deleteById(id);
        }
        catch (ResourceNotFoundException e){
            throw new ResourceNotFoundException(id);
        }
    }
}
