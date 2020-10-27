package com.projetocapacitacao.domain.categorias;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categorias")
@Getter
@Setter
public class categorias implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "categorias")
    private String categorias;

    @JsonIgnore
    @OneToMany(mappedBy = "categorias", cascade = CascadeType.ALL)
    private List<com.projetocapacitacao.domain.livros.livros> livros;

}
