package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Solicitud;
import pe.edu.upc.backup.repositories.ISolicitudRepository;
import pe.edu.upc.backup.services.ISolicitudService;

import java.util.List;

@Service
public class SolicitudServiceImplement implements ISolicitudService {
    @Autowired
    private ISolicitudRepository fR;

    @Override
    public void insert(Solicitud solicitud) {
        fR.save(solicitud);
    }

    @Override
    public List<Solicitud> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idsolicitud) {
        fR.deleteById(idsolicitud);
    }

    @Override
    public Solicitud listId(int idsolicitud) {
        return fR.findById(idsolicitud).orElse(new Solicitud());
    }

    @Override
    public List<Solicitud> listNoaceptadas() {
        return fR.listNoaceptadas();
    }

    @Override
    public List<Solicitud> listIdestudiante(int idestudiante) {
        return fR.listidestudiante(idestudiante);
    }

}
