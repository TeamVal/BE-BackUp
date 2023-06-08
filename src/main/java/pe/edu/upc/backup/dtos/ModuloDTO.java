package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Recurso;

public class ModuloDTO {
    private int idmodulo;

    private String titulo;

    private String descripcion;
    private String estado;

    private Recurso recurso;

    public int getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
}


