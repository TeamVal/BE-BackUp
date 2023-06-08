package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.backup.entities.MicroCurso;

import java.util.List;

public interface IMicroCursoRepository extends JpaRepository<MicroCurso, Integer> {
    @Query("from MicroCurso v where v.tema =:tema")
    List<MicroCurso> findByTema(String tema);
    @Query("SELECT v FROM MicroCurso v WHERE v.lenguaje.tipoLeng = :tipo")
    List<MicroCurso> findMicrocursoTipoLenguaje(@Param("tipo") String tipo);
}
