package com.githut.wallace.BibliotecaOnline.entities;

import com.githut.wallace.BibliotecaOnline.enums.StatusLivro;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "livros")  // Nome da tabela explícito (opcional)
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Correção aqui
    private UUID id;

    private String autor;
    private String titulo;

    @OneToMany(mappedBy = "livro", cascade = CascadeType.ALL)
    private List<Emprestimo> emprestimoList;

    @Temporal(TemporalType.DATE)
    private Date anoPublicacao;

    @Enumerated(EnumType.STRING)
    private StatusLivro statusLivro;

    public Livro() {}

    public Livro(String autor, String titulo, Date anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public UUID getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
