package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Grupo;
import pe.edu.upc.backup.repositories.IGrupoRepository;
import pe.edu.upc.backup.services.IGrupoService;

import java.util.List;

@Service
public class GrupoServiceImplement implements IGrupoService{
    @Autowired
    private IGrupoRepository gR;

    @Override
    public void insert(Grupo grupo) {
        gR.save(grupo);
    }

    @Override
    public List<Grupo> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int id) {
        gR.deleteById(id);
    }

    @Override
    public Grupo listId(int id) {
        return gR.findById(id).orElse(new Grupo());
    }
}
