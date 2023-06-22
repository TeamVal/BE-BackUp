package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "solicitudes")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idsolicitud;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "descrip", nullable = false)
    private String descrip;
    @Column(name = "fechasol", nullable = false)
    private LocalDate fechasol;
    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;

    public Solicitud() {
    }

    public Solicitud(int idsolicitud, String nombre, String descrip, LocalDate fechasol, Estudiante estudiante) {
        this.idsolicitud = idsolicitud;
        this.nombre = nombre;
        this.descrip = descrip;
        this.fechasol = fechasol;
        this.estudiante = estudiante;
    }

    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public LocalDate getFechasol() {
        return fechasol;
    }

    public void setFechasol(LocalDate fechasol) {
        this.fechasol = fechasol;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
