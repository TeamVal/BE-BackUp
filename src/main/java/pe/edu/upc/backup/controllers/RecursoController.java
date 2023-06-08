package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.RecursoDTO;
import pe.edu.upc.backup.entities.Recurso;
import pe.edu.upc.backup.services.IRecursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class RecursoController {
    @Autowired
    private IRecursoService lS;
    @PostMapping
    public void insert(@RequestBody RecursoDTO dto){
        ModelMapper m=new ModelMapper();
        Recurso a=m.map(dto, Recurso.class);
        lS.insert(a);
    }
    @GetMapping
    public List<RecursoDTO> List(){
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RecursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        lS.delete(id);
    }
    @GetMapping("/{id}")
    public RecursoDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        RecursoDTO dto=m.map(lS.listId(id),RecursoDTO.class);
        return dto;
    }
    @PutMapping("/{id}")
    public void update(@RequestBody RecursoDTO dto){
        ModelMapper m=new ModelMapper();
        Recurso r=m.map(dto, Recurso.class);
        lS.insert(r);
    }
}
