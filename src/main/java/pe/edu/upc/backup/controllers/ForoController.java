package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.ForoDTO;
import pe.edu.upc.backup.entities.Foro;
import pe.edu.upc.backup.services.IForoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForoController {
    @Autowired
    private IForoService fS;
    @PostMapping
    public void insert(@RequestBody ForoDTO dto){
        ModelMapper m=new ModelMapper();
        Foro a=m.map(dto, Foro.class);
        fS.insert(a);
    }
    @GetMapping
    public List<ForoDTO> List(){
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ForoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        fS.delete(id);
    }
    @GetMapping("/{id}")
    public ForoDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        ForoDTO dto=m.map(fS.listId(id),ForoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody ForoDTO dto){
        ModelMapper m=new ModelMapper();
        Foro r=m.map(dto, Foro.class);
        fS.insert(r);
    }
}
