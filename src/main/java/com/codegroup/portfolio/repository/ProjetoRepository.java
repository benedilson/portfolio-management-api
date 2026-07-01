package com.codegroup.portfolio.repository;

import com.codegroup.portfolio.model.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto,Long> {
}
