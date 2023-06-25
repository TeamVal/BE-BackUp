package pe.edu.upc.backup.dtos;

public class LenguajeDTO {
    private int idLenguaje;
    private String descrip;
    private String abrev;
    private String tipoLeng;

    public int getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(int idLenguaje) {
        this.idLenguaje = idLenguaje;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDesc(String descrip) {
        this.descrip = descrip;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public String getTipoLeng() {
        return tipoLeng;
    }

    public void setTipoLeng(String tipoLeng) {
        this.tipoLeng = tipoLeng;
    }
}
