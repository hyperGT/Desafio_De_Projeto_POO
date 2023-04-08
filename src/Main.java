import edu.gabriel.projetodesafio.bootcamp.*;

import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso(123);

        cursoJava.setTitulo("Java");
        cursoJava.setDecricao("Bem vindo ao curso Java");



        Conteudo cursoPython = new Curso(114);

        cursoPython.setTitulo("Python");
        cursoPython.setDecricao("Bem vindo ao curso Python");


        Mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setTitulo("Java Mentoria");
        mentoriaJava.setDecricao("Primeira mentoria java");
        mentoriaJava.setData_Mentoria(LocalDateTime.of(2023, 03, 28, 18, 00));


        Mentoria mentoriaPython = new Mentoria();

        mentoriaPython.setTitulo("Java Mentoria");
        mentoriaPython.setDecricao("Primeira mentoria java");
        mentoriaPython.setData_Mentoria(LocalDateTime.of(2023, 03, 26, 17, 50));


        Bootcamp bootcampJavaEPython = new Bootcamp();

        bootcampJavaEPython.setNome("Bootcamp Java + Python Dev");
        bootcampJavaEPython.setDescricao("Novo bootcamp java e Python");
        bootcampJavaEPython.getConteudos().add(cursoJava);
        bootcampJavaEPython.getConteudos().add(mentoriaJava);
//        bootcampJavaEPython.getConteudos().add(cursoPython);
//        bootcampJavaEPython.getConteudos().add(mentoriaPython);

        Dev devJonas = new Dev();

        devJonas.setNomeDeUsuario_Dev("Jonas");
        devJonas.inscreverBootcamp(bootcampJavaEPython);

        Dev devGabriel = new Dev();

        devGabriel.setNomeDeUsuario_Dev("Gabriel");
        devGabriel.inscreverBootcamp(bootcampJavaEPython);

        devJonas.progredir();
        System.out.println("Conteudos Inscritos: " + devJonas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJonas.getConteudosConcluidos());
        System.out.println("XP: " + devJonas.calcularTotalXp());

        System.out.println("-----------------------------");

        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("Conteudos Inscritos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());










    }
}
