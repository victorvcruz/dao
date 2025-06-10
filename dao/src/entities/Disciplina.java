package entities;

public class Disciplina {
    private Integer idDisciplina;
    private String nomeDisciplina;
    private Integer cargaHoraria;

    public Disciplina(Integer idDisciplina, String nomeDisciplina, Integer cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "idDisciplina=" + idDisciplina +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
