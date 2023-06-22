package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Asesoria;

import java.util.List;

public interface IAsesoriaService {
    public void insert(Asesoria asesoria);
    List<Asesoria> list();
    public void delete(int idasesoria);
    public Asesoria listId(int idasesoria);
    public List<Asesoria>  listIdasesor(int idasesor);

}
