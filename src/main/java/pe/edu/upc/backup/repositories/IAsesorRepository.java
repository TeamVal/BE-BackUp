package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.Asesor;

public interface IAsesorRepository extends JpaRepository<Asesor, Integer> {
}
