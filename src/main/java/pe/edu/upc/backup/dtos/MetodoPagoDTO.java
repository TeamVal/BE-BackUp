package pe.edu.upc.backup.dtos;

import pe.edu.upc.backup.entities.Estudiante;

import java.time.LocalDate;

public class MetodoPagoDTO {
    private int  IdMetodoPago;

    private String nombre;

    private String tipo;

    private String numero;

    private LocalDate fechacaducidad;
    private Estudiante estudiante;

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
