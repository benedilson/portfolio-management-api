package com.codegroup.portfolio.model.entity;

import com.codegroup.portfolio.model.enums.NivelRisco;
import com.codegroup.portfolio.model.enums.StatusProjeto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    private LocalDate dataInicio, previsaoTermino, dataRealTermino;

    private BigDecimal orcamento;

    @Enumerated(EnumType.STRING)
    private StatusProjeto status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Membro gerente;

    @ManyToMany
    private Set<Membro> membros =  new HashSet<>();

    @Transient
    private NivelRisco risco;

}
