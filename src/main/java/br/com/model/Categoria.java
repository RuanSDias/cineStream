package br.com.model;

import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;
    private List<Filme> filmes;

    public Categoria (){};
    
    public Categoria(Integer id, String nome, List<Filme> filmes) {
        this.id = id;
        this.nome = nome;
        this.filmes = filmes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }    
}
