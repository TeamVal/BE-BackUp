package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Estudiante;

import java.time.LocalDate;

public class SolicitudDTO {

    private int  idsolicitud;
    private String nombre;
    private String descrip;
    private LocalDate fechasol;
    private Estudiante estudiante;

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public LocalDate getFechasol() {
        return fechasol;
    }

    public void setFechasol(LocalDate fechasol) {
        this.fechasol = fechasol;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
