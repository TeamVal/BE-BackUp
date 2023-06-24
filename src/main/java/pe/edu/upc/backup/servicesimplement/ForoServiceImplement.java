package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Foro;
import pe.edu.upc.backup.repositories.IForoRepository;
import pe.edu.upc.backup.services.IForoService;

import java.util.List;

@Service
public class ForoServiceImplement implements IForoService {
    @Autowired
    private IForoRepository fR;
    @Override
    public void insert(Foro foro) {
        fR.save(foro);
    }

    @Override
    public List<Foro> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idforo) {
        fR.deleteById(idforo);
    }

    @Override
    public Foro listId(int idforo) {
        return fR.findById(idforo).orElse(new Foro());
    }
}
