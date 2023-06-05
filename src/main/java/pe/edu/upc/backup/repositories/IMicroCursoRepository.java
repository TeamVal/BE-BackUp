package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.MicroCurso;

public interface IMicroCursoRepository extends JpaRepository<MicroCurso, Integer> {
}
