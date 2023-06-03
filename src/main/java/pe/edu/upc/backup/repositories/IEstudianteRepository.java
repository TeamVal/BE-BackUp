package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
