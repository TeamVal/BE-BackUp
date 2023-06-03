package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Administrador;
import pe.edu.upc.backup.repositories.IAdministradorRepository;
import pe.edu.upc.backup.services.IAdministradorService;

import java.util.List;
@Service
public class AdministradorServiceImplement implements IAdministradorService {

    @Autowired
    private IAdministradorRepository aR;

    @Override
    public void insert(Administrador administrador) {
        aR.save(administrador);
    }

    @Override
    public List<Administrador> list() {
        return aR.findAll();
    }
}
