package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Asesor;

import java.util.List;

@Repository
public interface IAsesorRepository extends JpaRepository<Asesor, Integer> {
    @Query("from Asesor v where v.users.username =:username")
    Asesor listbyUser(String username);


    @Query(value = "SELECT ase.nom, COUNT(ases.idasesoria) FROM asesores ase \n" +
            "JOIN asesoria ases ON ase.id_asesor = ases.id_asesor \n" +
            "GROUP BY ase.nom ORDER BY COUNT(ases.idasesoria) ASC", nativeQuery = true)
    List<String[]> getAsesorCountByAsesorias();

}
