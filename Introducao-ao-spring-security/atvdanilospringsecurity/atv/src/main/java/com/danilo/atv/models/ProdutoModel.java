package com.danilo.atv.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
// Define a classe como uma entidade persistida no banco de dados.
@Table(name = "tbl_produto")
// Especifica o nome da tabela correspondente no banco.
@Data
// Lombok gera automaticamente getters, setters e outros métodos.
public class ProdutoModel {

    @Id
    // Define o campo como chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Gera automaticamente o valor da chave primária.
    private Long id;
    private String nome;
    private int preco;

}
