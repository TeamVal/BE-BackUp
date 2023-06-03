package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Estudiante;
import pe.edu.upc.backup.entities.Lenguaje;

import java.util.List;

public interface ILenguajeService {
    public void insert(Lenguaje lenguaje);
    List<Lenguaje> list();

    public void delete(int id);

    public Lenguaje listId(int id);

}
