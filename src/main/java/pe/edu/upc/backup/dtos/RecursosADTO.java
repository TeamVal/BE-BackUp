package pe.edu.upc.backup.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class RecursosADTO {
    private int idRecursosA;

    private String titulo;

    private String tema;

    private String tipoContenido;

    private String url;

    private String tamano;

    public int getIdRecursosA() {
        return idRecursosA;
    }

    public void setIdRecursosA(int idRecursosA) {
        this.idRecursosA = idRecursosA;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
