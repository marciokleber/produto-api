package com.github.marciokleber.produtoapi.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
    @SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO", initialValue = 1,allocationSize = 1)
    @Comment("PRIMARY KEY DA TABELA PRODUTO")
    private Long Id;

    @Column(nullable = false)
    @Comment("NOME DO PRODUTO")
    private String nome;

    @Column(nullable = false)
    @Comment("QUANTIDADE DO PRODUTO EM ESTOQUE")
    private Integer quantidade;

    @Column(nullable = false)
    @Comment("PREÇO DO PRODUTO")
    private Double preco;

    @Comment("DESCRIÇÃO DO PRODUTO")
    private String descricao;
}
