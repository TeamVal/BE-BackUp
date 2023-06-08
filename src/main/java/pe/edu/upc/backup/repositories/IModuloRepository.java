package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.Modulo;

public interface IModuloRepository extends JpaRepository<Modulo,Integer> {

}
