package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Administrador;

import java.util.List;

public interface IAdministradorService {
    public void insert(Administrador administrador);
    List<Administrador> list();
}
