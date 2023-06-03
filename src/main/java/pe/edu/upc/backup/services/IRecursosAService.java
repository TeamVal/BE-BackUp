package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.RecursosA;

import java.util.List;

public interface IRecursosAService {
    public void insert(RecursosA recursosA);
    List<RecursosA> list();
    public void delete(int idRecur);
    public RecursosA listId(int idRecur);
}
