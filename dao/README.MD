# Data Access Object (DAO) Pattern Example in Java

This project is a Java application developed as part of the Object-Oriented Programming II course. It demonstrates the use of the DAO (Data Access Object) pattern to perform CRUD (Create, Read, Update, Delete) operations on a database table named `disciplina`.

## Features

- Insert new disciplines into the database.
- Update existing discipline information.
- Delete disciplines by their ID.
- Retrieve a discipline by its ID.
- List all disciplines stored in the database.

## Technologies Used

- **Java**: Programming language used for the application.
- **JDBC**: Java Database Connectivity for database interaction.
- **SQL**: Structured Query Language for database operations.

## Project Structure

- `DisciplinaDAO`: Interface defining the CRUD operations.
- `DisciplinaDAOImp`: Implementation of the `DisciplinaDAO` interface using JDBC.
- `Disciplina`: Entity class representing a discipline.
- `Main`: Entry point of the application, demonstrating the CRUD operations.

## How to Run

1. Set up a database with a table named `disciplina` with the following structure:
   ```sql
   CREATE TABLE disciplina (
       id_disciplina INT PRIMARY KEY,
       nome_disciplina VARCHAR(255),
       carga_horaria INT
   );
   ```

2. Configure the database connection in the `DB` class.

3. Compile and run the `Main` class to execute the application.

## Example Output

The application performs the following operations:
1. Inserts a new discipline.
2. Updates the discipline's information.
3. Retrieves and displays the discipline by ID.
4. Lists all disciplines in the database.
5. Deletes a discipline by ID.
6. Lists the remaining disciplines.

```plaintext
Disciplina inserida!
Disciplina atualizada!
Disciplina encontrada: Disciplina{id=1, nome='Estrutura de Dados Avançada', cargaHoraria=80}
Todas as disciplinas:
Disciplina{id=1, nome='Estrutura de Dados Avançada', cargaHoraria=80}
Disciplina{id=2, nome='Programação Orientada a Objetos', cargaHoraria=60}
Disciplina{id=3, nome='Banco de Dados', cargaHoraria=40}
Disciplina com ID 1 deletada!
Disciplinas restantes:
Disciplina{id=2, nome='Programação Orientada a Objetos', cargaHoraria=60}
Disciplina{id=3, nome='Banco de Dados', cargaHoraria=40}
```