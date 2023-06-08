package pe.edu.upc.backup.entities;

import javax.persistence.*;

@Entity
@Table(name = "recursos")
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrecurso;

    @Column(name = "titulo",length = 100, nullable = false)
    private String titulo;

    @Column(name = "tema",length = 100, nullable = false)
    private String tema;

    @Column(name = "tipoContenido",length = 100, nullable = false)
    private String tipoContenido;

    @Column(name = "url",length = 100, nullable = false)
    private String url;

    @Column(name = "tamano",length = 100, nullable = false)
    private String tamano;

    public Recurso() {
    }

    public Recurso(int idrecurso, String titulo, String tema, String tipoContenido, String url, String tamano) {
        this.idrecurso = idrecurso;
        this.titulo = titulo;
        this.tema = tema;
        this.tipoContenido = tipoContenido;
        this.url = url;
        this.tamano = tamano;
    }

    public int getIdrecurso() {
        return idrecurso;
    }

    public void setIdrecurso(int idrecurso) {
        this.idrecurso = idrecurso;
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