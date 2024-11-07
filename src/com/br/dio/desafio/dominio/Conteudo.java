package com.br.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Professor professor;

    public abstract double calcularXp();

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Conteudo(String titulo, String descricao, Professor professor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
