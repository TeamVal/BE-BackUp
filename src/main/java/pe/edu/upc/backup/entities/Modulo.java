package pe.edu.upc.backup.entities;

import javax.persistence.*;

@Entity
@Table(name="modulos")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idmodulo;
    @Column(name = "titulo",length = 40,nullable = false)
    private String titulo;
    @Column(name = "descripcion",length = 40,nullable = false)

    private String descripcion;
    @Column(name = "estado",length = 40,nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idrecurso",nullable = false)
    private Recurso recurso;

    public Modulo() {
    }

    public Modulo(int idmodulo, String titulo, String descripcion, String estado, Recurso recurso) {
        this.idmodulo = idmodulo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.recurso = recurso;
    }

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
