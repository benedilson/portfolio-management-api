package com.codegroup.portfolio.service;

import com.codegroup.portfolio.model.entity.Projeto;
import com.codegroup.portfolio.model.enums.NivelRisco;
import com.codegroup.portfolio.service.CalculadoraRisco;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraRiscoTest {

    @Test
    void  projetoComOrcamentoBaixoEPrazoCurtoDeveSerBaixo() {

        Projeto projeto = new Projeto();
        projeto.setOrcamento(new BigDecimal("50000"));
        projeto.setDataInicio(LocalDate.of(2026, 1, 1));
        projeto.setPrevisaoTermino(LocalDate.of(2026, 3, 1));

        NivelRisco resultado = new CalculadoraRisco().calcular(projeto);

        assertEquals(NivelRisco.BAIXO, resultado);

    }
}
