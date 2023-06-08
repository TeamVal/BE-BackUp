package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Modulo;

import java.util.List;

public interface IModuleService {
    public void insert(Modulo modulo);
    List<Modulo> list();
    public void delete(int idmodulo);
    public Modulo listId(int idmodulo);
}
