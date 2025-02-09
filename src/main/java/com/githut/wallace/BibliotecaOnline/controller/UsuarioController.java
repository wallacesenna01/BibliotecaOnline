package com.githut.wallace.BibliotecaOnline.controller;

import com.githut.wallace.BibliotecaOnline.entities.Usuarios;
import com.githut.wallace.BibliotecaOnline.recources.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/novo")
    public String mostraformulario(Model model ) {
        model.addAttribute("usuario", new Usuarios());
        return "usuario-form";
    }

    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute Usuarios usuarios) {
        usuarioService.salvarUsuario(usuarios);
        return "redirect:/usuarios/novo";
    }

}
