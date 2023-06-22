package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.SolicitudDTO;
import pe.edu.upc.backup.entities.Solicitud;
import pe.edu.upc.backup.services.ISolicitudService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    @Autowired
    private ISolicitudService fS;
    @PostMapping
    public void insert(@RequestBody SolicitudDTO dto){
        ModelMapper m=new ModelMapper();
        Solicitud a=m.map(dto, Solicitud.class);
        fS.insert(a);
    }
    @GetMapping
    public List<SolicitudDTO> List(){
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, SolicitudDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        fS.delete(id);
    }
    @GetMapping("/{id}")
    public SolicitudDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        SolicitudDTO dto=m.map(fS.listId(id),SolicitudDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody SolicitudDTO dto){
        ModelMapper m=new ModelMapper();
        Solicitud r=m.map(dto, Solicitud.class);
        fS.insert(r);
    }
    @GetMapping("/listnoaceptadas")
    public List<SolicitudDTO> listNoaceptadas(){
        return fS.listNoaceptadas().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, SolicitudDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listidestudiante/{idestudiante}")
    public List<SolicitudDTO> listIdestudiante(@PathVariable Integer idestudiante) {
        return fS.listIdestudiante(idestudiante).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SolicitudDTO.class);
        }).collect(Collectors.toList());

    }
}
