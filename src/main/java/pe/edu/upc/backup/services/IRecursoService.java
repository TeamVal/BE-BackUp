package pe.edu.upc.backup.services;

import pe.edu.upc.backup.dtos.ContenidoDTO;
import pe.edu.upc.backup.entities.Recurso;

import java.util.List;

public interface IRecursoService {
    public void insert(Recurso recurso);
    List<Recurso> list();
    public void delete(int idrecurso);
    public Recurso listId(int idrecurso);
    public List<ContenidoDTO> get2tipoconteido();

}
