package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.Administrador;

public interface IAdministradorRepository extends JpaRepository<Administrador, Integer> {
}
