package com.projetocapacitacao.domain.livros;

import com.projetocapacitacao.core.Controller.ResponseAbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class livrosControler extends ResponseAbstractController {

    @Autowired
    private livrosService livrosService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return jsonResponse(livrosService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@Validated @RequestBody livros livros, Errors errors) {
        return jsonResponse(livrosService.save(livros, errors));
    }

    @PutMapping
    public ResponseEntity<?> update(@Validated @RequestBody livros livros, Errors errors) {
        return jsonResponse(livrosService.save(livros, errors));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findOne(@PathVariable long id) {
        return jsonResponse(livrosService.findOne(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id) {
        livrosService.deleteById(id);
        return jsonResponse();
    }

}
