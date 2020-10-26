package com.projetocapacitacao.domain.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class livrosService {

    @Autowired
    private livrosRepository livrosRepository;

    public List<livros> findAll() {
        return livrosRepository.findAll();
    }

    public livros findOne(long id) {
        return livrosRepository.findById(id).get();
    }

    public livros save(livros livros, Errors errors) {
        return livrosRepository.save(livros);
    }

    public void deleteById(long id) {
        livrosRepository.deleteById(id);
    }
}
