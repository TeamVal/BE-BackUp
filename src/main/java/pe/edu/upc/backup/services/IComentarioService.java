package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public void insert(Comentario comentario);
    List<Comentario> list();
    public void delete(int idcomentario);
    public Comentario listId(int idcomentario);
    public List<Comentario> listIdforo(int idforo);

}
