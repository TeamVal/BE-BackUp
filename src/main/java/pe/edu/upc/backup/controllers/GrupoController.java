package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.GrupoDTO;
import pe.edu.upc.backup.entities.Grupo;
import pe.edu.upc.backup.services.IGrupoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    @Autowired
    private IGrupoService gS;
    @PostMapping
    public void insert(@RequestBody GrupoDTO dto){
        ModelMapper m=new ModelMapper();
        Grupo p=m.map(dto, Grupo.class);
        gS.insert(p);
    }
    @GetMapping
    public List<GrupoDTO> List(){
        return gS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, GrupoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        gS.delete(id);
    }
    @GetMapping("/{id}")
    public GrupoDTO listId(@PathVariable ("id")Integer id){
        ModelMapper m=new ModelMapper();
        GrupoDTO dto=m.map(gS.listId(id),GrupoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody GrupoDTO dto){
        ModelMapper m=new ModelMapper();
        Grupo p=m.map(dto, Grupo.class);
        gS.insert(p);
    }
}
