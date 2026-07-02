package com.codegroup.portfolio.service;

import com.codegroup.portfolio.model.entity.Projeto;
import com.codegroup.portfolio.model.enums.NivelRisco;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;

public class CalculadoraRisco {
    public NivelRisco calcular(Projeto projeto) {
        BigDecimal orcamento = projeto.getOrcamento();
        long meses = ChronoUnit.MONTHS.between(projeto.getDataInicio(), projeto.getPrevisaoTermino());

            if ( orcamento.compareTo(new BigDecimal("500000")) > 0 || meses > 6) {
                return NivelRisco.ALTO;
            }

            // MÉDIO: orçamento > 100k  OU  meses > 3
            if ( orcamento.compareTo(new BigDecimal("100000")) >0 || meses > 3) {
                return NivelRisco.MEDIO;
            }
            else {
                return NivelRisco.BAIXO;

        }

    }

}
