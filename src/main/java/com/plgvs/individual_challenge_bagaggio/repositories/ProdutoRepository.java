package com.plgvs.individual_challenge_bagaggio.repositories;

import com.plgvs.individual_challenge_bagaggio.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
