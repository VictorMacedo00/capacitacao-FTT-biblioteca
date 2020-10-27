package com.projetocapacitacao.domain.estantes;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "estantes")
@Getter
@Setter
public class estantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "estantes")
    private String estantes;

    @NotNull
    @JoinColumn(name = "secoes_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private com.projetocapacitacao.domain.secoes.secoes secoes;
}
