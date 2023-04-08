package edu.gabriel.projetodesafio.bootcamp;

import java.time.LocalDateTime;


public class Mentoria extends Conteudo{
    private LocalDateTime data_Mentoria;

    public Mentoria() {
    }

    public LocalDateTime getData_Mentoria() {
        return data_Mentoria;
    }

    public void setData_Mentoria(LocalDateTime data_Mentoria) {
        this.data_Mentoria = data_Mentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo_Mentoria='" + getTitulo() + '\'' +
                ", descricao_Mentoria='" + getDecricao() + '\'' +
                ", data_Mentoria=" + data_Mentoria +
                '}';
    }

    // metodo calcularXp()
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


}
