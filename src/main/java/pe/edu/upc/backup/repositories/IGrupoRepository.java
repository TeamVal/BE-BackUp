package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Grupo;
@Repository
public interface IGrupoRepository extends JpaRepository<Grupo, Integer> {
}
