package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String nome;
    private String documento;
    private Set<Conteudo> materias = new LinkedHashSet<>();

    public Professor(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public void incluirMaterias(Conteudo materia){
        this.materias.add(materia);
    }

    public void consultarMaterias(){
        if (materias.isEmpty()) {
            System.err.println("Professor sem matéria cadastrada!!");
        } else {
            for (Conteudo materia : materias) {
                System.out.println(materia.getTitulo());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}
