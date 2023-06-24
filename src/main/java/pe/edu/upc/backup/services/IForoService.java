package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Foro;

import java.util.List;

public interface IForoService {
    public void insert(Foro foro);
    List<Foro> list();
    public void delete(int idforo);
    public Foro listId(int idforo);
}
