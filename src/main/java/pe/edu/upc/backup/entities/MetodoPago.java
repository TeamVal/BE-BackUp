package pe.edu.upc.backup.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "metodopago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  IdMetodoPago;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "numero", nullable = false)
    private String numero;
    @Column(name = "fechadecaducidad", nullable = false)
    private LocalDate fechacaducidad;
    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;
    public MetodoPago(){

    }

    public MetodoPago(int idMetodoPago, String nombre, String tipo, String numero, LocalDate fechacaducidad, Estudiante estudiante) {
        IdMetodoPago = idMetodoPago;
        this.nombre = nombre;
        this.tipo = tipo;
        this.numero = numero;
        this.fechacaducidad = fechacaducidad;
        this.estudiante = estudiante;
    }

    public int getIdMetodoPago() {
        return IdMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        IdMetodoPago = idMetodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(LocalDate fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
