package edu.gabriel.projetodesafio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nomeDeUsuario_Dev;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev() {
    }

    public String getNomeDeUsuario_Dev() {
        return nomeDeUsuario_Dev;
    }

    public void setNomeDeUsuario_Dev(String nomeDeUsuario_Dev) {
        this.nomeDeUsuario_Dev = nomeDeUsuario_Dev;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nomeDeUsuario_Dev, dev.nomeDeUsuario_Dev) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDeUsuario_Dev, conteudosInscritos, conteudosConcluidos);
    }


    // todo inscrever_Bootcamp()
    public void inscreverBootcamp(Bootcamp bootcamp){

    }

    // todo progredir()
    public void progredir(){

    }

    // todo calcularTotalXp()


    // todo exibirCursos()
    public String exibirCursos() {
        return "Dev{" +
                "conteudosInscritos=" + conteudosInscritos +
                '}';
    }
}
