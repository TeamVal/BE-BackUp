package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.ComentarioDTO;
import pe.edu.upc.backup.entities.Comentario;
import pe.edu.upc.backup.services.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService fS;
    @PostMapping
    public void insert(@RequestBody ComentarioDTO dto){
        ModelMapper m=new ModelMapper();
        Comentario a=m.map(dto, Comentario.class);
        fS.insert(a);
    }
    @GetMapping
    public List<ComentarioDTO> List(){
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        fS.delete(id);
    }
    @GetMapping("/{id}")
    public ComentarioDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        ComentarioDTO dto=m.map(fS.listId(id),ComentarioDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody ComentarioDTO dto){
        ModelMapper m=new ModelMapper();
        Comentario r=m.map(dto, Comentario.class);
        fS.insert(r);
    }
    @GetMapping("/listxIdforo/{idforo}")
    public List<ComentarioDTO> listIdmicro(@PathVariable Integer idforo) {
        return fS.listIdforo(idforo).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());

    }
}
