package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Estudiante;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query("from Estudiante v where v.users.username =:username")
    Estudiante listbyUser(String username);
}
