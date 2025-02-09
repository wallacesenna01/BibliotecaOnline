package com.githut.wallace.BibliotecaOnline.repositories;

import com.githut.wallace.BibliotecaOnline.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
