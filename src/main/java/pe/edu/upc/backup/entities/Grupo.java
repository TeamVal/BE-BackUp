package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "grupodetrabajo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupo;
    @Column(name = "nombre", length=50, nullable = false)
    private String nombre;
    @Column(name = "descripcion", length=400, nullable = false)
    private String descripcion;
    @Column(name = "fechaCrear", nullable = false)
    private LocalDate fechaCrear;

    public Grupo() {
    }

    public Grupo(int idGrupo, String nombre, String descripcion, LocalDate fechaCrear) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCrear = fechaCrear;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCrear() {
        return fechaCrear;
    }

    public void setFechaCrear(LocalDate fechaCrear) {
        this.fechaCrear = fechaCrear;
    }
}
