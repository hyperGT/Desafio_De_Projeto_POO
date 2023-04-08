package edu.gabriel.projetodesafio.bootcamp;

public class Curso extends Conteudo{

    private int cargaHoraria_Curso;


    public Curso() {

    }

    public Curso(int cargaHoraria_Curso) {
        this.cargaHoraria_Curso = cargaHoraria_Curso;
    }

    public int getCargaHoraria_Curso() {
        return cargaHoraria_Curso;
    }

    public void setCargaHoraria_Curso(int cargaHoraria_Curso) {
        this.cargaHoraria_Curso = cargaHoraria_Curso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo_Curso='" + getTitulo() + '\'' +
                ", descricao_Curso='" + getDecricao() + '\'' +
                ", cargaHoraria_Curso=" + cargaHoraria_Curso +
                '}';
    }

    // metodo calcularXp()
    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria_Curso();
    }
}
