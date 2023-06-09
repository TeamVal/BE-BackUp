package pe.edu.upc.backup.services;

import pe.edu.upc.backup.dtos.BancoDTO;
import pe.edu.upc.backup.entities.MetodoPago;

import java.util.List;

public interface IMetodoPagoService {
    public void insert(MetodoPago metodoPago);
    List<MetodoPago> list();
    public void delete(int idMetodop);
    public MetodoPago listId(int idMetodop);
    public List<MetodoPago>  listIdestudiante(Integer idestudiante);

    public List<BancoDTO>  getBancoCountMetodo();

}
