package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.AdministradorDTO;
import pe.edu.upc.backup.entities.Administrador;
import pe.edu.upc.backup.services.IAdministradorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {
    @Autowired
    private IAdministradorService aS;
    @PostMapping
    public void insert(@RequestBody AdministradorDTO dto){
        ModelMapper m=new ModelMapper();
        Administrador a=m.map(dto, Administrador.class);
        aS.insert(a);
    }
    @GetMapping
    public List<AdministradorDTO> List(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, AdministradorDTO.class);
        }).collect(Collectors.toList());
    }
}
