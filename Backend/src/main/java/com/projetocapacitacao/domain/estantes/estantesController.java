package com.projetocapacitacao.domain.estantes;

import com.projetocapacitacao.core.Controller.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estantes")
public class estantesController extends AbstractController<estantes> {
}
