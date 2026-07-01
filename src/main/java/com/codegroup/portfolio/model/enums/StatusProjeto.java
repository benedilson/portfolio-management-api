package com.codegroup.portfolio.model.enums;

public enum StatusProjeto {

    EM_ANALISE(1),
    ANALISE_REALIZADA(2),
    ANALISE_APROVADA(3),
    INICIADO(4),
    PLANEJADO(5),
    EM_ANDAMENTO(6),
    ENCERRADO(7),
    CANCELADO(0);

    private final int ordem;

    StatusProjeto(int ordem) {
        this.ordem = ordem;
    }

    public int getOrdem() {
        return ordem;
    }
}
