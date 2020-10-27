package com.projetocapacitacao.domain.categorias;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriasRepository extends JpaRepository<categorias, Long> {
}

