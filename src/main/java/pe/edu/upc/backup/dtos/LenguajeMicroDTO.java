package pe.edu.upc.backup.dtos;

public class LenguajeMicroDTO {
    private String tipo_leng;
    private int microCount;

    public LenguajeMicroDTO() {
    }

    public LenguajeMicroDTO(String tipo_leng, int microCount) {
        this.tipo_leng = tipo_leng;
        this.microCount = microCount;
    }

    public String getTipo_leng() {
        return tipo_leng;
    }

    public void setTipo_leng(String tipo_leng) {
        this.tipo_leng = tipo_leng;
    }

    public int getMicroCount() {
        return microCount;
    }

    public void setMicroCount(int microCount) {
        this.microCount = microCount;
    }
}
