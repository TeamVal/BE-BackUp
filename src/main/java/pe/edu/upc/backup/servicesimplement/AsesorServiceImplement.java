package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.dtos.AsesorAsesoriaDTO;
import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.repositories.IAsesorRepository;
import pe.edu.upc.backup.services.IAsesorService;

import java.util.ArrayList;
import java.util.List;
@Service
public class AsesorServiceImplement implements IAsesorService {
    @Autowired
    private IAsesorRepository aR;

    @Override
    public void insert(Asesor asesor) {
        aR.save(asesor);
    }

    @Override
    public List<Asesor> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);
    }

    @Override
    public Asesor listId(int id) {
        return aR.findById(id).orElse(new Asesor());
    }

    @Override
    public Asesor listbyUser(String username) {
        return aR.listbyUser(username);
    }
    @Override
    public List<AsesorAsesoriaDTO> getAsesorCountByAsesorias(){
        List<String[]> petCountByVaccine = aR.getAsesorCountByAsesorias();
        List<AsesorAsesoriaDTO> asesorAsesoriaDTOs = new ArrayList<>();

        for (String[] data : petCountByVaccine) {
            AsesorAsesoriaDTO dto = new AsesorAsesoriaDTO();
            dto.setNom(data[0]);
            dto.setAsesoriaCount(Integer.parseInt(data[1]));
            asesorAsesoriaDTOs.add(dto);
        }

        return asesorAsesoriaDTOs;
    }

}
