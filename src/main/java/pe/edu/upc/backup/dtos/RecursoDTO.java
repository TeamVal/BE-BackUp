package pe.edu.upc.backup.dtos;

public class RecursoDTO {
    private int idrecurso;

    private String titulo;

    private String tema;

    private String tipoContenido;

    private String url;
    private String tamano;
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
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
}
