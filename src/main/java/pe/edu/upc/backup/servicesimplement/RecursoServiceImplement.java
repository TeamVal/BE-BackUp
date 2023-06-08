package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Recurso;
import pe.edu.upc.backup.repositories.IRecursoRepository;
import pe.edu.upc.backup.services.IRecursoService;

import java.util.List;
@Service
public class RecursoServiceImplement implements IRecursoService {
    @Autowired
    private IRecursoRepository rR;
    @Override
    public void insert(Recurso recurso) {
        rR.save(recurso);

    }

    @Override
    public List<Recurso> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idrecurso) {
        rR.deleteById(idrecurso);

    }

    @Override
    public Recurso listId(int idrecurso) {
        return rR.findById(idrecurso).orElse(new Recurso());
    }
}
