package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.MetodoPago;

public interface IMetodoPagoRepository extends JpaRepository<MetodoPago,Integer> {
}
