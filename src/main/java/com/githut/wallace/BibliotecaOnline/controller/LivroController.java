package com.githut.wallace.BibliotecaOnline.controller;

import com.githut.wallace.BibliotecaOnline.entities.Livro;
import com.githut.wallace.BibliotecaOnline.recources.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("livro" , new Livro());
        return "livro-form";
    }

    @PostMapping("/salvar")
    public String salvarLivro(@ModelAttribute Livro livro) {
        livroService.salvar(livro);
        return "redirect:/livros/novo";
    }
}
