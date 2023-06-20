package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.VideoTutorial;

import java.util.List;

public interface IVideoTutorialService {
    public void insert(VideoTutorial videoTutorial);
    List<VideoTutorial> list();
    public void delete(int idVideo);
    public VideoTutorial listId(int idVideo);
    public List<VideoTutorial> listIdasesor(int idasesor);
}
