package com.projetocapacitacao.domain.categorias;

import com.projetocapacitacao.core.Controller.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class categoriasController extends AbstractController<categorias> {
}