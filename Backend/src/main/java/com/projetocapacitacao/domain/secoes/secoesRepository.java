package com.projetocapacitacao.domain.secoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface secoesRepository extends JpaRepository<secoes, Long> {
}
