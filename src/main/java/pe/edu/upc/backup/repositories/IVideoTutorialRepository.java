package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.VideoTutorial;

import java.util.List;

@Repository
public interface IVideoTutorialRepository extends JpaRepository<VideoTutorial, Integer> {
    @Query("from VideoTutorial v where v.asesor.idAsesor =:idasesor")
    List<VideoTutorial> listIdasesor(Integer idasesor);
}
