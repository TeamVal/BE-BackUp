package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.MicroCurso;

import java.util.List;

public interface IMicroCursoService {
    public void insert(MicroCurso microCurso);
    List<MicroCurso> list();
    public void delete(int idMicro);
    public MicroCurso listId(int idMicro);
    public List<MicroCurso>  buscarFecha(String tema);
    public List<MicroCurso>  findMicrocursoTipoLenguaje(String tipo);
    public List<MicroCurso> listIdasesor(int idasesor);

}
