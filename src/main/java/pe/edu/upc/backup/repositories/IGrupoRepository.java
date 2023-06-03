package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.Grupo;

public interface IGrupoRepository extends JpaRepository<Grupo, Integer> {
}
