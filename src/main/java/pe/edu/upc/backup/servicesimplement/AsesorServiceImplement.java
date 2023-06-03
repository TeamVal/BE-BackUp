package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.repositories.IAsesorRepository;
import pe.edu.upc.backup.services.IAsesorService;

import java.util.List;
@Service
public class AsesorServiceImplement implements IAsesorService {
    @Autowired
    private IAsesorRepository aR;

    @Override
    public void insert(Asesor asesor) {
        aR.save(asesor);
    }

    @Override
    public List<Asesor> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public Asesor listId(int id) {
        return aR.findById(id).orElse(new Asesor());
    }
}
