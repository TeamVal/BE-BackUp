package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.RecursosA;
import pe.edu.upc.backup.repositories.IRecursosARepository;
import pe.edu.upc.backup.services.IRecursosAService;

import java.util.List;
@Service
public class RecursosServicesImplement implements IRecursosAService {
    @Autowired
    private IRecursosARepository rR;

    @Override
    public void insert(RecursosA recursosA) {
        rR.save(recursosA);
    }

    @Override
    public List<RecursosA> list() {
        return rR.findAll();
    }
    @Override
    public void delete(int idRecur){

       rR.deleteById(idRecur);
    }
    @Override
    public RecursosA listId(int idRecur) {
        return rR.findById(idRecur).orElse(new RecursosA());
    }
}
