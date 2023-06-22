package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.MetodoPago;

import java.util.List;

@Repository
public interface IMetodoPagoRepository extends JpaRepository<MetodoPago,Integer> {
    @Query("from MetodoPago v where v.estudiante.idEstudiante =:idestudiante")
    List<MetodoPago> listIdestudiante(Integer idestudiante);
}
