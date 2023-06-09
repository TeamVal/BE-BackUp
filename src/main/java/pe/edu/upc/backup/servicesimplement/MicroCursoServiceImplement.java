package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.MicroCurso;
import pe.edu.upc.backup.repositories.IMicroCursoRepository;
import pe.edu.upc.backup.services.IMicroCursoService;

import java.util.List;
@Service
public class MicroCursoServiceImplement implements IMicroCursoService {
    @Autowired
    private IMicroCursoRepository mR;
    @Override
    public void insert(MicroCurso microCurso) {
        mR.save(microCurso);
    }

    @Override
    public List<MicroCurso> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMicro) {
        mR.deleteById(idMicro);
    }

    @Override
    public MicroCurso listId(int idMicro) {
        return mR.findById(idMicro).orElse(new MicroCurso());
    }
    @Override
    public List<MicroCurso> buscarFecha(String tema) {
        return mR.findByTema(tema);
    }

    @Override
    public List<MicroCurso> findMicrocursoTipoLenguaje(String tipo) {
        return mR.findMicrocursoTipoLenguaje(tipo);
    }
    @Override
    public List<MicroCurso> listIdasesor(int idasesor) {
        return mR.listIdasesor(idasesor);
    }
}
