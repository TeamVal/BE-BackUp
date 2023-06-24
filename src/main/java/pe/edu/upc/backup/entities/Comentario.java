package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idcomentario;
    @Column(name = "texto", nullable = false)
    private String texto;
    @Column(name = "fechapublic", nullable = false)
    private LocalDate fechapublic;
    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;
    @ManyToOne
    @JoinColumn(name = "idforo", nullable = false)
    private Foro foro;

    public Comentario() {
    }

    public Comentario(int idcomentario, String texto, LocalDate fechapublic, Estudiante estudiante, Foro foro) {
        this.idcomentario = idcomentario;
        this.texto = texto;
        this.fechapublic = fechapublic;
        this.estudiante = estudiante;
        this.foro = foro;
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFechapublic() {
        return fechapublic;
    }

    public void setFechapublic(LocalDate fechapublic) {
        this.fechapublic = fechapublic;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Foro getForo() {
        return foro;
    }

    public void setForo(Foro foro) {
        this.foro = foro;
    }
}
