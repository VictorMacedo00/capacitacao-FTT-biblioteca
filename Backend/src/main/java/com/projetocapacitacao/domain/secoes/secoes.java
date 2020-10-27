package com.projetocapacitacao.domain.secoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "secoes")
@Getter
@Setter
public class secoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "secoes")
    private String secoes;

    @JsonIgnore
    @OneToMany(mappedBy = "secoes", cascade = CascadeType.ALL)
    private List<com.projetocapacitacao.domain.estantes.estantes> estantes;

}
