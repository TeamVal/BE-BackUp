package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.AsesoriaDTO;
import pe.edu.upc.backup.entities.Asesoria;
import pe.edu.upc.backup.services.IAsesoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asesorias")
public class AsesoriaController {
    @Autowired
    private IAsesoriaService MS;
    @PostMapping
    public void insert(@RequestBody AsesoriaDTO dto){
        ModelMapper m=new ModelMapper();
        Asesoria a=m.map(dto, Asesoria.class);
        MS.insert(a);
    }
    @GetMapping
    public List<AsesoriaDTO> List(){
        return MS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, AsesoriaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        MS.delete(id);
    }
    @GetMapping("/{id}")
    public AsesoriaDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        AsesoriaDTO dto=m.map(MS.listId(id),AsesoriaDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody AsesoriaDTO dto){
        ModelMapper m=new ModelMapper();
        Asesoria r=m.map(dto, Asesoria.class);
        MS.insert(r);
    }

    @GetMapping("/listidasesor/{idasesor}")
    public List<AsesoriaDTO> listidasesor(@PathVariable Integer idasesor) {
        return MS.listIdasesor(idasesor).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AsesoriaDTO.class);
        }).collect(Collectors.toList());

    }

    @GetMapping("/listidestudiante/{idEstudiante}")
    public List<AsesoriaDTO> listidestudiante(@PathVariable Integer idEstudiante) {
        return MS.listidestudiante(idEstudiante).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AsesoriaDTO.class);
        }).collect(Collectors.toList());

    }
}
