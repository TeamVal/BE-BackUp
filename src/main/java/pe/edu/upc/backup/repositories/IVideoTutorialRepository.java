package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.backup.entities.VideoTutorial;

public interface IVideoTutorialRepository extends JpaRepository<VideoTutorial, Integer> {

}
