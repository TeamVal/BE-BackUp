package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.backup.dtos.MicroCursoDTO;
import pe.edu.upc.backup.entities.MicroCurso;
import pe.edu.upc.backup.services.IMicroCursoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/microcursos")
public class MicroCursoController {
    @Autowired
    private IMicroCursoService MS;
    @PostMapping
    public void insert(@RequestBody MicroCursoDTO dto){
        ModelMapper m=new ModelMapper();
        MicroCurso a=m.map(dto, MicroCurso.class);
        MS.insert(a);
    }
    @GetMapping
    public List<MicroCursoDTO> List(){
        return MS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MicroCursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        MS.delete(id);
    }
    @GetMapping("/{id}")
    public MicroCursoDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        MicroCursoDTO dto=m.map(MS.listId(id),MicroCursoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody MicroCursoDTO dto){
        ModelMapper m=new ModelMapper();
        MicroCurso r=m.map(dto, MicroCurso.class);
        MS.insert(r);
    }
}
