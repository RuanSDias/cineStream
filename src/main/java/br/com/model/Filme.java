package br.com.model;

import java.time.LocalDate;

public class Filme {

    private Integer id;
    private Categoria categoria;
    private String nome;
    private LocalDate dataDeLancamento;
    private String descricao;

    public Filme (){};
    
    public Filme(Integer id, Categoria categoria, String nome, LocalDate dataDeLancamento, String descricao) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.descricao = descricao;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }
    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}
