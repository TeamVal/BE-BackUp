package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Solicitud;

import java.util.List;

public interface ISolicitudService {
    public void insert(Solicitud solicitud);
    List<Solicitud> list();
    public void delete(int idsolicitud);
    public Solicitud listId(int idsolicitud);
    public List<Solicitud> listNoaceptadas();
    public List<Solicitud>  listIdestudiante(int idestudiante);

}
