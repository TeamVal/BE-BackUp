package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Asesoria;

import java.util.List;

@Repository
public interface IAsesoriaRepository extends JpaRepository<Asesoria, Integer> {
    @Query("from Asesoria v where v.asesor.idAsesor =:idasesor")
    List<Asesoria> listidasesor(Integer idasesor);

    @Query("from Asesoria v where v.solicitud.estudiante.idEstudiante =:idEstudiante")
    List<Asesoria> listidestudiante(Integer idEstudiante);
}
