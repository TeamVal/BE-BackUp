package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.entities.Solicitud;

import java.time.LocalDate;

public class AsesoriaDTO {

    private int idasesoria;
    private int tiempo;
    private LocalDate fechaacep;
    private Double precio;
    private Asesor asesor;
    private Solicitud solicitud;

    public int getIdasesoria() {
        return idasesoria;
    }

    public void setIdasesoria(int idasesoria) {
        this.idasesoria = idasesoria;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public LocalDate getFechaacep() {
        return fechaacep;
    }

    public void setFechaacep(LocalDate fechaacep) {
        this.fechaacep = fechaacep;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
}
