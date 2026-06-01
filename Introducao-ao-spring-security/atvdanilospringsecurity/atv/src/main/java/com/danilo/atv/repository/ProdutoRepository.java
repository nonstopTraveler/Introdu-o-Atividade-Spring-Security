package com.danilo.atv.repository;

import com.danilo.atv.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
// Interface responsável pelas operações de acesso ao banco de dados.
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
