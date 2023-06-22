package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asesoria")
public class Asesoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idasesoria;
    @Column(name = "tiempo", length = 50, nullable = false)
    private int tiempo;
    @Column(name = "fechaacep", length = 400, nullable = false)
    private LocalDate fechaacep;
    @Column(name = "precio", length = 50, nullable = false)
    private Double precio;
    @ManyToOne
    @JoinColumn(name = "idAsesor", nullable = false)
    private Asesor asesor;
    @ManyToOne
    @JoinColumn(name = "idsolicitud", nullable = false)
    private Solicitud solicitud;

    public Asesoria() {
    }

    public Asesoria(int idasesoria, int tiempo, LocalDate fechaacep, Double precio, Asesor asesor, Solicitud solicitud) {
        this.idasesoria = idasesoria;
        this.tiempo = tiempo;
        this.fechaacep = fechaacep;
        this.precio = precio;
        this.asesor = asesor;
        this.solicitud = solicitud;
    }

    public int getIdasesoria() {
        return idasesoria;
    }

    public void setIdasesoria(int idasesoria) {
        this.idasesoria = idasesoria;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public LocalDate getFechaacep() {
        return fechaacep;
    }

    public void setFechaacep(LocalDate fechaacep) {
        this.fechaacep = fechaacep;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
}
