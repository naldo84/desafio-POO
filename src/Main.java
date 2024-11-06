import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do curso de java completo.");
        cursoJava.setCargaHoraria(80);

        Curso cursoPython= new Curso();
        cursoPython.setTitulo("Curso de Python");
        cursoPython.setDescricao("Descrição do curso de Python completo.");
        cursoPython.setCargaHoraria(40);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria do curso de Java");
        mentoriaJava.setData(LocalDate.of(2024, 02,01));

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Mentoria de Python");
        mentoriaPython.setDescricao("Mentoria do curso de Python");
        mentoriaPython.setData(LocalDate.of(2024, 02,01));


        System.out.println(cursoJava);
        System.out.println(cursoPython);
        System.out.println(mentoriaJava);
        System.out.println(mentoriaPython);


    }
}
