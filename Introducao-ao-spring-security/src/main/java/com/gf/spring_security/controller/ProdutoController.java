package com.gf.spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String listarProdutos() {
        return "Lista de produtos";
    }

    @PostMapping
    public String cadastrarProduto() {
        return "Produto cadastrado com sucesso";
    }
}
