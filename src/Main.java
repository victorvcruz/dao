import entities.Disciplina;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DisciplinaDAO disciplinaDAO = new DisciplinaDAOImp();

        Disciplina novaDisciplina = new Disciplina(1, "Estrutura de Dados", 60);
        disciplinaDAO.insert(novaDisciplina);
        System.out.println("Disciplina inserida!");

        Disciplina disciplinaAtualizada = new Disciplina(1, "Estrutura de Dados Avançada", 80);
        disciplinaDAO.update(disciplinaAtualizada);
        System.out.println("Disciplina atualizada!");

        Disciplina disciplinaEncontrada = disciplinaDAO.findById(1);
        System.out.println("Disciplina encontrada: " + disciplinaEncontrada);

        disciplinaDAO.insert(new Disciplina(2, "Programação Orientada a Objetos", 60));
        disciplinaDAO.insert(new Disciplina(3, "Banco de Dados", 40));

        List<Disciplina> disciplinas = disciplinaDAO.findAll();
        System.out.println("Todas as disciplinas:");
        for (Disciplina d : disciplinas) {
            System.out.println(d);
        }

        disciplinaDAO.deleteById(1);
        System.out.println("Disciplina com ID 1 deletada!");

        disciplinas = disciplinaDAO.findAll();
        System.out.println("Disciplinas restantes:");
        for (Disciplina d : disciplinas) {
            System.out.println(d);
        }
    }
}
