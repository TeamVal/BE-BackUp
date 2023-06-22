package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Asesoria;
import pe.edu.upc.backup.repositories.IAsesoriaRepository;
import pe.edu.upc.backup.services.IAsesoriaService;

import java.util.List;

@Service
public class AsesoriaServiceImplement implements IAsesoriaService {
    @Autowired
    private IAsesoriaRepository mR;
    @Override
    public void insert(Asesoria asesoria) {
        mR.save(asesoria);
    }

    @Override
    public List<Asesoria> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idasesoria) {
        mR.deleteById(idasesoria);
    }

    @Override
    public Asesoria listId(int idasesoria) {
        return mR.findById(idasesoria).orElse(new Asesoria());
    }

    @Override
    public List<Asesoria> listIdasesor(int idasesor) {
        return mR.listidasesor(idasesor);
    }

}
