package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Estudiante;
import pe.edu.upc.backup.entities.Foro;

import java.time.LocalDate;

public class ComentarioDTO {

    private int  idcomentario;
    private String texto;
    private LocalDate fechapublic;
    private Estudiante estudiante;
    private Foro foro;

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechapublic() {
        return fechapublic;
    }

    public void setFechapublic(LocalDate fechapublic) {
        this.fechapublic = fechapublic;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Foro getForo() {
        return foro;
    }

    public void setForo(Foro foro) {
        this.foro = foro;
    }
}
