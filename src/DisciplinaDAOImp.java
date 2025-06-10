import entities.Disciplina;
import jdbc.DB;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAOImp implements DisciplinaDAO {

    @Override
    public void insert(Disciplina disciplina) {
        String sql = "INSERT INTO disciplina (id_disciplina, nome_disciplina, carga_horaria) VALUES (?, ?, ?)";
        try (var connection = DB.getConexao();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, disciplina.getIdDisciplina());
            preparedStatement.setString(2, disciplina.getNomeDisciplina());
            preparedStatement.setInt(3, disciplina.getCargaHoraria());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Disciplina disciplina) {
        String sql = "UPDATE disciplina SET nome_disciplina = ?, carga_horaria = ? WHERE id_disciplina = ?";
        try (var connection = DB.getConexao();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, disciplina.getNomeDisciplina());
            preparedStatement.setInt(2, disciplina.getCargaHoraria());
            preparedStatement.setInt(3, disciplina.getIdDisciplina());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(Integer idDisciplina) {
        String sql = "DELETE FROM disciplina WHERE id_disciplina = ?";
        try (var connection = DB.getConexao();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idDisciplina);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Disciplina findById(Integer idDisciplina) {
        String sql = "SELECT * FROM disciplina WHERE id_disciplina = ?";
        try (var connection = DB.getConexao();
             var preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idDisciplina);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new Disciplina(
                            resultSet.getInt("id_disciplina"),
                            resultSet.getString("nome_disciplina"),
                            resultSet.getInt("carga_horaria")
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Disciplina> findAll() {
        String sql = "SELECT * FROM disciplina";
        List<Disciplina> disciplinas = new ArrayList<>();
        try (var connection = DB.getConexao();
             var preparedStatement = connection.prepareStatement(sql);
             var resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Disciplina disciplina = new Disciplina(
                        resultSet.getInt("id_disciplina"),
                        resultSet.getString("nome_disciplina"),
                        resultSet.getInt("carga_horaria")
                );
                disciplinas.add(disciplina);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinas;
    }
}
