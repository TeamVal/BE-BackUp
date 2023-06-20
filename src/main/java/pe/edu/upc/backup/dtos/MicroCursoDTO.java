package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Asesor;
import pe.edu.upc.backup.entities.Lenguaje;

public class MicroCursoDTO {

    private int idMicroCurso;
    private String titulo;
    private String descrip;
    private String tema;

    private Asesor asesor;

    private Lenguaje lenguaje;

    public int getIdMicroCurso() {
        return idMicroCurso;
    }

    public void setIdMicroCurso(int idMicroCurso) {
        this.idMicroCurso = idMicroCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
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
