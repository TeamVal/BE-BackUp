package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Solicitud;

import java.util.List;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud,Integer>  {
    @Query("select s from Solicitud s where s.idsolicitud not in (select a.solicitud.idsolicitud from Asesoria a)")
    List<Solicitud> listNoaceptadas();

    @Query("from Solicitud v where v.estudiante.idEstudiante =:idestudiante")
    List<Solicitud> listidestudiante(Integer idestudiante);
}
