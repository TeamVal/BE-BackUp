package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Lenguaje;
import pe.edu.upc.backup.repositories.ILenguajeRepository;
import pe.edu.upc.backup.services.ILenguajeService;

import java.util.List;
@Service
public class LenguajeServiceImplement implements ILenguajeService {
    @Autowired
    private ILenguajeRepository lR;

    @Override
    public void insert(Lenguaje lenguaje) {
        lR.save(lenguaje);
    }

    @Override
    public List<Lenguaje> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int id) {
    lR.deleteById(id);

    }

    @Override
    public Lenguaje listId(int id) {
        return lR.findById(id).orElse(new Lenguaje());
    }

}
