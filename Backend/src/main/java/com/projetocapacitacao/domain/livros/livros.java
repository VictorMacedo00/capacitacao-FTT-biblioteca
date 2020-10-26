package com.projetocapacitacao.domain.livros;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "livros")
@Getter
@Setter
public class livros implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "titulo")
    private String titulo;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "nome_autor")
    private String nome_autor;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "isbn")
    private String isbn;

}
