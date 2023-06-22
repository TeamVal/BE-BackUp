package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
    public void delete(int id);
    public  Estudiante listId(int id);
    public Estudiante listbyUser(String username);

}
