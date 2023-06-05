package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Administrador;
import pe.edu.upc.backup.entities.Asesor;

import java.util.List;

public interface IAdministradorService {
    public void insert(Administrador administrador);
    List<Administrador> list();
    public void delete(int id);
    public Administrador listId(int id);
}
