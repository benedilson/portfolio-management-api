package com.codegroup.portfolio.model.entity;

import com.codegroup.portfolio.model.enums.Atribuicao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Atribuicao atribuicao;

}
