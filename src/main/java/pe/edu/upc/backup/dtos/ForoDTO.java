package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Estudiante;

import java.time.LocalDate;

public class ForoDTO {

    private int  idforo;
    private String titulo;
    private String texto;
    private LocalDate fechacreacion;
    private Estudiante estudiante;


    public int getIdforo() {
        return idforo;
    }

    public void setIdforo(int idforo) {
        this.idforo = idforo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
