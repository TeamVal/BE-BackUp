package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.BancoDTO;
import pe.edu.upc.backup.dtos.MetodoPagoDTO;
import pe.edu.upc.backup.entities.MetodoPago;
import pe.edu.upc.backup.services.IMetodoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metodopagos")
public class MetodoPagoController {
    @Autowired
    private IMetodoPagoService MpS;
    @PostMapping
    public void insert(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago a=m.map(dto, MetodoPago.class);
        MpS.insert(a);
    }
    @GetMapping
    public List<MetodoPagoDTO> List(){
        return MpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MetodoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        MpS.delete(id);
    }
    @GetMapping("/{id}")
    public MetodoPagoDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        MetodoPagoDTO dto=m.map(MpS.listId(id),MetodoPagoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody MetodoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        MetodoPago r=m.map(dto, MetodoPago.class);
        MpS.insert(r);
    }
    @GetMapping("/listaporidestudiante/{idestudiante}")
    public List<MetodoPagoDTO> listIdestudiante(@PathVariable Integer idestudiante) {
        return MpS.listIdestudiante(idestudiante).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MetodoPagoDTO.class);
        }).collect(Collectors.toList());

    }

    @GetMapping("/banco-count")
    public List<BancoDTO> getBancoCountMetodo() {
        List<BancoDTO> bancoDTOs = MpS.getBancoCountMetodo();
        return bancoDTOs;
    }
}
