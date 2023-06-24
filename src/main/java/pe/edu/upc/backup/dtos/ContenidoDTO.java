package pe.edu.upc.backup.dtos;

public class ContenidoDTO {
    private String tipocontenido;
    private int count;

    public ContenidoDTO() {
    }

    public ContenidoDTO(String tipocontenido, int count) {
        this.tipocontenido = tipocontenido;
        this.count = count;
    }

    public String getTipocontenido() {
        return tipocontenido;
    }

    public void setTipocontenido(String tipocontenido) {
        this.tipocontenido = tipocontenido;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
