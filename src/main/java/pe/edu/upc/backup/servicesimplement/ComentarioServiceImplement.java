package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Comentario;
import pe.edu.upc.backup.repositories.IComentarioRepository;
import pe.edu.upc.backup.services.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository fR;

    @Override
    public void insert(Comentario comentario) {
        fR.save(comentario);
    }

    @Override
    public List<Comentario> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idcomentario) {
        fR.deleteById(idcomentario);
    }

    @Override
    public Comentario listId(int idcomentario) {
        return fR.findById(idcomentario).orElse(new Comentario());
    }

    @Override
    public List<Comentario> listIdforo(int idforo) {
        return fR.listIdforo(idforo);
    }
}
