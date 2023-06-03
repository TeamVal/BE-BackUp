package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Grupo;

import java.util.List;

public interface IGrupoService {
    public void insert(Grupo grupo);
    List<Grupo> list();
    public void delete(int id);
    public  Grupo listId(int id);
}
