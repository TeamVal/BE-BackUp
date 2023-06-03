package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Asesor;

import java.util.List;

public interface IAsesorService {
    public void insert(Asesor asesor);
    List<Asesor> list();
    public void delete(int id);
    public Asesor listId(int id);
}
