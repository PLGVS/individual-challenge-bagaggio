package com.plgvs.individual_challenge_bagaggio.config;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import com.plgvs.individual_challenge_bagaggio.repositories.ProdutoRepository;
import com.plgvs.individual_challenge_bagaggio.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        Produto p1 = new Produto(null, "Mala de Bordo 10 Kg", "Mala de Bordo PP Preta", 199.90, 3);
        Produto p2 = new Produto(null, "Mala de Bordo 8 Kg", "Mala de Bordo PP Branca", 169.90, 2);

        produtoRepository.saveAll(Arrays.asList(p1, p2));
    }
}
