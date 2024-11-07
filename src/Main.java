import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Curso de Java", "Descrição do curso de Java", 8);

        Professor professor1 = new Professor("Prof Piton Rastejante", "1122334455");
        professor1.consultarMaterias();

        Curso cursoPython = new Curso("Curso de Python", "Descricao do curso de Python", 4, professor1);
        professor1.consultarMaterias();

        System.out.println("\nIncluindo mais de uma matéria e consultando as matérias do professor");
        professor1.incluirMaterias(cursoJava);
        professor1.consultarMaterias();


        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Mentoria do Curso de Java", LocalDate.of(2024, 02,01));

        Mentoria mentoriaPython = new Mentoria("Mentoria de Python", "Mentoria do Curso de Python", LocalDate.now(), professor1);

        System.out.println("Detalhes do curso: " + cursoPython);

/*        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso de Java Script");
        cursoJavaScript.setDescricao("Descrição do curos de Java Script");
        cursoJavaScript.setCargaHoraria(70);

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Curso de Java Script");
        mentoriaJavaScript.setDescricao("Descrição do curos de Java Script");
        mentoriaJavaScript.setData(LocalDate.now());*/


/*        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
        System.out.println(mentoriaPython);
        System.out.println(cursoJavaScript);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(cursoJava);

   /*     bootcamp1.getConteudos().add(cursoJavaScript);
        bootcamp1.getConteudos().add(mentoriaJava);*/

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


        System.out.println("\n----------------- Vete");
        Dev devVete = new Dev();
        devVete.setNome("Vete");
        devVete.inscreverBootcampo(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devVete.getConteudosInscritos());


        System.out.println("Depois da progressão");
        devVete.progredir();
        System.out.println("Conteúdos inscritos: " + devVete.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devVete.getConteudosConcluidos());
    }
}
