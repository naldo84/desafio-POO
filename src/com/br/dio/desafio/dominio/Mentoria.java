package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate data;
   private Professor professor;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public Mentoria(String titulo, String descricao, LocalDate data, Professor professor) {
        super(titulo, descricao, professor);
        this.data = data;

        if (professor != null){
            professor.incluirMaterias(this);
        }
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo: '" + getTitulo() + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", data: " + data +
                '}';
    }
}
