package com.githut.wallace.BibliotecaOnline.recources;

import com.githut.wallace.BibliotecaOnline.entities.Usuarios;
import com.githut.wallace.BibliotecaOnline.repositories.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository repository;

    public Usuarios salvarUsuario(Usuarios usuarios) {
        return repository.save(usuarios);
    }
}
