package pe.edu.upc.backup.dtos;

public class BancoDTO {
    private String nombre;
    private int count;

    public BancoDTO() {
    }

    public BancoDTO(String nombre, int count) {
        this.nombre = nombre;
        this.count = count;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
