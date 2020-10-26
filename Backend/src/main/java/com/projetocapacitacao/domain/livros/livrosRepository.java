package com.projetocapacitacao.domain.livros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface livrosRepository extends JpaRepository<livros, Long> {
}
