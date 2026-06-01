package com.danilo.atv.service;

import com.danilo.atv.models.ProdutoModel;
import com.danilo.atv.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Define a classe como camada de serviço da aplicação.
public class xProdutoService {

    @Autowired
    // Injeta automaticamente o repositório na classe.
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarPessoa(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }
}