package com.githut.wallace.BibliotecaOnline.repositories;

import com.githut.wallace.BibliotecaOnline.entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
