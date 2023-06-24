package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.dtos.ContenidoDTO;
import pe.edu.upc.backup.entities.Recurso;
import pe.edu.upc.backup.repositories.IRecursoRepository;
import pe.edu.upc.backup.services.IRecursoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecursoServiceImplement implements IRecursoService {
    @Autowired
    private IRecursoRepository rR;
    @Override
    public void insert(Recurso recurso) {
        rR.save(recurso);

    }

    @Override
    public List<Recurso> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idrecurso) {
        rR.deleteById(idrecurso);

    }

    @Override
    public Recurso listId(int idrecurso) {
        return rR.findById(idrecurso).orElse(new Recurso());
    }

    @Override
    public List<ContenidoDTO> get2tipoconteido() {
        List<String[]> contenido = rR.get2tipoconteido();
        List<ContenidoDTO> contenidoDTOs = new ArrayList<>();

        for (String[] data : contenido) {
            ContenidoDTO dto = new ContenidoDTO();
            dto.setTipocontenido(data[0]);
            dto.setCount(Integer.parseInt(data[1]));
            contenidoDTOs.add(dto);
        }

        return contenidoDTOs;

    }

}
