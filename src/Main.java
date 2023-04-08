import edu.gabriel.projetodesafio.bootcamp.Conteudo;
import edu.gabriel.projetodesafio.bootcamp.Curso;
import edu.gabriel.projetodesafio.bootcamp.Dev;
import edu.gabriel.projetodesafio.bootcamp.Mentoria;

import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        Conteudo cursoPython = new Curso();

        System.out.println(cursoJava.toString());

        Mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setData_Mentoria(LocalDateTime.of(2023, 03, 28, 18, 00));


        System.out.println(mentoriaJava.toString());


        Dev novoUser = new Dev();

        novoUser.setNomeDeUsuario_Dev("Jonas");
        novoUser.getConteudosInscritos();
        novoUser.getConteudosConcluidos();



        System.out.println(novoUser.toString());


    }
}
