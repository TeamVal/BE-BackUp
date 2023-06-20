package pe.edu.upc.backup.entities;

import javax.persistence.*;

@Entity
@Table(name = "microcurso")
public class MicroCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMicroCurso;
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    @Column(name = "descrip", length = 400, nullable = false)
    private String descrip;
    @Column(name = "tema", length = 50, nullable = false)
    private String tema;
    @ManyToOne
    @JoinColumn(name = "idAsesor", nullable = false)
    private Asesor asesor;
    @ManyToOne
    @JoinColumn(name = "idLenguaje", nullable = false)
    private Lenguaje lenguaje;

    public MicroCurso() {
    }

    public MicroCurso(int idMicroCurso, String titulo, String descrip, String tema, Asesor asesor, Lenguaje lenguaje) {
        this.idMicroCurso = idMicroCurso;
        this.titulo = titulo;
        this.descrip = descrip;
        this.tema = tema;
        this.asesor = asesor;
        this.lenguaje = lenguaje;
    }

    public int getIdMicroCurso() {
        return idMicroCurso;
    }

    public void setIdMicroCurso(int idMicroCurso) {
        this.idMicroCurso = idMicroCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }
}
