package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Modulo;

import java.util.List;

@Repository
public interface IModuloRepository extends JpaRepository<Modulo,Integer> {
    @Query("from Modulo v where v.microcurso.idMicroCurso =:idmicro")
    List<Modulo> listIdmicro(Integer idmicro);
}
