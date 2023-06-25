package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.LenguajeDTO;
import pe.edu.upc.backup.dtos.LenguajeMicroDTO;
import pe.edu.upc.backup.entities.Lenguaje;
import pe.edu.upc.backup.services.ILenguajeService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/lenguajes")
public class LenguajeController {
    @Autowired
    private ILenguajeService lS;
    @PostMapping
    public void insert(@RequestBody LenguajeDTO dto){
        ModelMapper m=new ModelMapper();
        Lenguaje a=m.map(dto, Lenguaje.class);
        lS.insert(a);
    }
    @GetMapping
    public List<LenguajeDTO> List(){
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, LenguajeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        lS.delete(id);

    }
    @GetMapping("/{id}")
    public LenguajeDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        LenguajeDTO dto = m.map(lS.listId(id),LenguajeDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody LenguajeDTO dto){
        ModelMapper m = new ModelMapper();
        Lenguaje l = m.map(dto, Lenguaje.class);
        lS.insert(l);

    }

    @GetMapping("/lenguaje-count")
    public List<LenguajeMicroDTO> getLenguajeCountByMicrocurso() {
        List<LenguajeMicroDTO> lenguajeMicroDTOs = lS.getLenguajeCountByMicrocurso();
        return lenguajeMicroDTOs;
    }
}
