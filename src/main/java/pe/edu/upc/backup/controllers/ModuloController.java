package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.ModuloDTO;
import pe.edu.upc.backup.entities.Modulo;
import pe.edu.upc.backup.services.IModuleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/modulos")
public class ModuloController {
    @Autowired

    private IModuleService cS;
    @PostMapping
    public void insert(@RequestBody ModuloDTO dto) {
        ModelMapper m = new ModelMapper();
        Modulo v = m.map(dto, Modulo.class);
        cS.insert(v);
    }
    @GetMapping
    public List<ModuloDTO> list() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ModuloDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void deletemodulo(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ModuloDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        ModuloDTO dto=m.map(cS.listId(id),ModuloDTO.class);
        return dto;
    }
    @PutMapping("/{id}")
    public void updatemodulo(@RequestBody ModuloDTO dto){
        ModelMapper m=new ModelMapper();
        Modulo r=m.map(dto, Modulo.class);
        cS.insert(r);
    }
}


