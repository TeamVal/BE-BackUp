package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.RecursosA;
import pe.edu.upc.backup.entities.VideoTutorial;
import pe.edu.upc.backup.repositories.IVideoTutorialRepository;
import pe.edu.upc.backup.services.IVideoTutorialService;

import java.util.List;

@Service
public class VideoTutorialServiceImplement implements IVideoTutorialService {
    @Autowired
    private IVideoTutorialRepository vR;

    @Override
    public void insert(VideoTutorial videoTutorial) {
        vR.save(videoTutorial);
    }

    @Override
    public List<VideoTutorial> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int idVideo) {
        vR.deleteById(idVideo);
    }

    @Override
    public VideoTutorial listId(int idVideo) {
        return vR.findById(idVideo).orElse(new VideoTutorial());
    }
}
