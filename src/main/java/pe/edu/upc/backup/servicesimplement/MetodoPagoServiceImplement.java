package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.MetodoPago;
import pe.edu.upc.backup.repositories.IMetodoPagoRepository;
import pe.edu.upc.backup.services.IMetodoPagoService;


import java.util.List;
@Service
public class MetodoPagoServiceImplement implements IMetodoPagoService {
    @Autowired
    private IMetodoPagoRepository mpR;
    @Override
    public void insert(MetodoPago metodoPago) {
        mpR.save(metodoPago);
    }

    @Override
    public List<MetodoPago> list() {
        return mpR.findAll();
    }

    @Override
    public void delete(int idMetodop) {
        mpR.deleteById(idMetodop);
    }

    @Override
    public MetodoPago listId(int idMetodop) {
        return mpR.findById(idMetodop).orElse(new MetodoPago());
    }
}
