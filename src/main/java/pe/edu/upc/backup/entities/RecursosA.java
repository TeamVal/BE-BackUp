package pe.edu.upc.backup.entities;

import javax.persistence.*;


@Entity
@Table(name = "recursos_a")
public class RecursosA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecursosA;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "tema", nullable = false)
    private String tema;

    @Column(name = "tipo_contenido", nullable = false)
    private String tipoContenido;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "tamano", nullable = false)
    private String tamano;

    public RecursosA() {
    }

    public RecursosA(int idRecursosA, String titulo, String tema, String tipoContenido, String url, String tamano) {
        this.idRecursosA = idRecursosA;
        this.titulo = titulo;
        this.tema = tema;
        this.tipoContenido = tipoContenido;
        this.url = url;
        this.tamano = tamano;
    }

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
