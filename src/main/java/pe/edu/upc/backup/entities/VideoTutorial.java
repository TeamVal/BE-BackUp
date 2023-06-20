package pe.edu.upc.backup.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "videoTutorial")
public class VideoTutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideoTutorial;
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    @Column(name = "fechaSubida", nullable = false)
    private LocalDate fechaSubida;
    @Column(name = "url", length = 50, nullable = false)
    private String url;
    @ManyToOne
    @JoinColumn(name = "idAsesor", nullable = false)
    private Asesor asesor;
    @ManyToOne
    @JoinColumn(name = "idLenguaje", nullable = false)
    private Lenguaje lenguaje;

    public VideoTutorial() {
    }

    public VideoTutorial(int idVideoTutorial, String titulo, LocalDate fechaSubida, String url, Asesor asesor, Lenguaje lenguaje) {
        this.idVideoTutorial = idVideoTutorial;
        this.titulo = titulo;
        this.fechaSubida = fechaSubida;
        this.url = url;
        this.asesor = asesor;
        this.lenguaje = lenguaje;
    }

    public int getIdVideoTutorial() {
        return idVideoTutorial;
    }

    public void setIdVideoTutorial(int idVideoTutorial) {
        this.idVideoTutorial = idVideoTutorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(LocalDate fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
