package com.githut.wallace.BibliotecaOnline.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Emprestimo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", unique = true, nullable = false)
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private  Livro livro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Temporal(TemporalType.DATE)
    private  Date imprestimo;
    
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;


    public  Emprestimo () {}

    public Emprestimo(Usuarios usuarios, Livro livro, Date imprestimo, Date dataDevolucao) {
        this.usuarios = usuarios;
        this.livro = livro;
        this.imprestimo = new Date();
        this.dataDevolucao = dataDevolucao;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getImprestimo() {
        return imprestimo;
    }

    public void setImprestimo(Date imprestimo) {
        this.imprestimo = imprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
