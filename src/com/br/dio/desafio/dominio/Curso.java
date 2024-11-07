package com.br.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private Professor professor;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;

    }

    public Curso(String titulo, String descricao, int cargaHoraria, Professor professor) {
        super(titulo, descricao, professor);
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;

        if (professor != null){
            professor.incluirMaterias(this);
        }
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo: '" + getTitulo()  + '\'' +
                ", descricao: '" + getDescricao() + '\'' +
                ", cargaHoraria: " + cargaHoraria +
                ", XP: " + calcularXp() +
                ", professor: " + (professor != null ? professor.getNome() : "Sem professor") + '\'' +

                '}';
    }


}
