package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Lenguaje;

import java.util.List;

@Repository
public interface ILenguajeRepository extends JpaRepository<Lenguaje, Integer> {
    @Query(value = "SELECT l.tipo_leng, COUNT(m.id_micro_curso) FROM lenguajes l \n" +
            "JOIN microcurso m ON l.id_lenguaje = m.id_lenguaje \n" +
            "GROUP BY l.tipo_leng ORDER BY COUNT(m.id_micro_curso) DESC", nativeQuery = true)
    List<String[]> getLenguajeCountByMicrocurso();
}
