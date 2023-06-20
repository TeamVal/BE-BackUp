package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.VideoTutorialDTO;
import pe.edu.upc.backup.entities.VideoTutorial;
import pe.edu.upc.backup.services.IVideoTutorialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/videostutoriales")
public class VideoTutorialController {
    @Autowired
    private IVideoTutorialService vS;
    @PostMapping
    public void insert(@RequestBody VideoTutorialDTO dto){
        ModelMapper m=new ModelMapper();
        VideoTutorial a=m.map(dto, VideoTutorial.class);
        vS.insert(a);
    }
    @GetMapping
    public List<VideoTutorialDTO> List(){
        return vS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, VideoTutorialDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){

        vS.delete(id);
    }
    @GetMapping("/{id}")
    public VideoTutorialDTO listId(@PathVariable("id") Integer id){

        ModelMapper m=new ModelMapper();
        VideoTutorialDTO dto=m.map(vS.listId(id),VideoTutorialDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody VideoTutorialDTO dto){
        ModelMapper m=new ModelMapper();
        VideoTutorial r=m.map(dto, VideoTutorial.class);
        vS.insert(r);
    }

    @GetMapping("/listxidasesor/{idasesor}")
    public List<VideoTutorialDTO> listIdasesor(@PathVariable Integer idasesor) {
        return vS.listIdasesor(idasesor).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VideoTutorialDTO.class);
        }).collect(Collectors.toList());

    }
}
