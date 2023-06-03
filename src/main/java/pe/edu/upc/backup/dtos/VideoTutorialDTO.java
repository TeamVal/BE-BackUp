package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.entities.Lenguaje;

import javax.persistence.*;
import java.time.LocalDate;

public class VideoTutorialDTO {

    private int idVideoTutorial;

    private String titulo;

    private LocalDate fechaSubida;

    private String url;

    private Asesor asesor;

    private Lenguaje lenguaje;

    public int getIdVideoTutorial() {
        return idVideoTutorial;
    }

    public void setIdVideoTutorial(int idVideoTutorial) {
        this.idVideoTutorial = idVideoTutorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(LocalDate fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }
}
