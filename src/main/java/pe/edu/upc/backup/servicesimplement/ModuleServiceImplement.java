package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Modulo;
import pe.edu.upc.backup.repositories.IModuloRepository;
import pe.edu.upc.backup.services.IModuleService;

import java.util.List;
@Service
public class ModuleServiceImplement implements IModuleService {
    @Autowired
    private IModuloRepository mR;


    @Override
    public void insert(Modulo modulo) {
        mR.save(modulo);
    }

    @Override
    public List<Modulo> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idmodulo) {
        mR.deleteById(idmodulo);

    }

    @Override
    public Modulo listId(int idmodulo) {
        return mR.findById(idmodulo).orElse(new Modulo());
    }
}
