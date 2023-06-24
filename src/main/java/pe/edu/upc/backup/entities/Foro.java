package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "foros")
public class Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idforo;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    @Column(name = "texto", nullable = false)
    private String texto;
    @Column(name = "fechacreacion", nullable = false)
    private LocalDate fechacreacion;
    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;

    public Foro() {
    }

    public Foro(int idforo, String titulo, String texto, LocalDate fechacreacion, Estudiante estudiante) {
        this.idforo = idforo;
        this.titulo = titulo;
        this.texto = texto;
        this.fechacreacion = fechacreacion;
        this.estudiante = estudiante;
    }

    public int getIdforo() {
        return idforo;
    }

    public void setIdforo(int idforo) {
        this.idforo = idforo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
