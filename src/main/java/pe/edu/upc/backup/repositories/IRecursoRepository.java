package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Recurso;

import java.util.List;

@Repository
public interface IRecursoRepository extends JpaRepository<Recurso,Integer> {

    @Query(value = "SELECT re.tipo_contenido, COUNT(re.idrecurso) FROM recursos re GROUP BY re.tipo_contenido ORDER BY COUNT(re.idrecurso) DESC limit 2", nativeQuery = true)
    List<String[]> get2tipoconteido();

}
