package pe.edu.upc.backup.services;

import pe.edu.upc.backup.dtos.LenguajeMicroDTO;
import pe.edu.upc.backup.entities.Lenguaje;

import java.util.List;

public interface ILenguajeService {
    public void insert(Lenguaje lenguaje);
    List<Lenguaje> list();

    public void delete(int id);

    public Lenguaje listId(int id);
    public List<LenguajeMicroDTO> getLenguajeCountByMicrocurso();


}
