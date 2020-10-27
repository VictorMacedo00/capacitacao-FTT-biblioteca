package com.projetocapacitacao.domain.estantes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estantesRepository extends JpaRepository<estantes, Long> {
}
