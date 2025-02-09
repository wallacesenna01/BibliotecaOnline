package com.githut.wallace.BibliotecaOnline.recources;

import com.githut.wallace.BibliotecaOnline.entities.Livro;
import com.githut.wallace.BibliotecaOnline.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public void salvar(Livro livro) {
        livroRepository.save(livro);
    }
}
