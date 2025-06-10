import entities.Disciplina;

import java.util.List;

public interface DisciplinaDAO {
    void insert(Disciplina disciplina);

    void update(Disciplina disciplina);

    void deleteById(Integer idDisciplina);

    Disciplina findById(Integer idDisciplina);

    List<Disciplina> findAll();
}
