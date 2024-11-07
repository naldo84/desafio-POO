import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do curso de java completo.");
        cursoJava.setCargaHoraria(8);

        Curso cursoPython= new Curso();
        cursoPython.setTitulo("Curso de Python");
        cursoPython.setDescricao("Descrição do curso de Python completo.");
        cursoPython.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria do curso de Java");
        mentoriaJava.setData(LocalDate.of(2024, 02,01));

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Mentoria de Python");
        mentoriaPython.setDescricao("Mentoria do curso de Python");
        mentoriaPython.setData(LocalDate.of(2024, 02,01));

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso de Java Script");
        cursoJavaScript.setDescricao("Descrição do curos de Java Script");
        cursoJavaScript.setCargaHoraria(70);

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Curso de Java Script");
        mentoriaJavaScript.setDescricao("Descrição do curos de Java Script");
        mentoriaJavaScript.setData(LocalDate.now());


/*        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
        System.out.println(mentoriaPython);
        System.out.println(cursoJavaScript);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(cursoJava);
        bootcamp1.getConteudos().add(cursoJavaScript);
        bootcamp1.getConteudos().add(mentoriaJava);

        //bootcamp1.getConteudos().add(mentoriaJavaScript);

        Dev devNaldo = new Dev();
        devNaldo.setNome("Naldo");
        devNaldo.inscreverBootcampo(bootcamp1);

        System.out.println("XP: " + devNaldo.calcularTotalXp());
        System.out.println("Conteúdos inscritos: " + devNaldo.getConteudosInscritos());


        System.out.println("Depois da progressão");
        devNaldo.progredir();
        devNaldo.progredir();
        System.out.println("Conteúdos inscritos: " + devNaldo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devNaldo.getConteudosConcluidos());
        System.out.println("XP: " + devNaldo.calcularTotalXp());


        System.out.println("\n-----------------");
        Dev devVete = new Dev();
        devVete.setNome("Vete");
        devVete.inscreverBootcampo(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devVete.getConteudosInscritos());
        devVete.progredir();

        System.out.println("Depois da progressão");
        System.out.println("Conteúdos inscritos: " + devVete.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devVete.getConteudosConcluidos());
    }
}
