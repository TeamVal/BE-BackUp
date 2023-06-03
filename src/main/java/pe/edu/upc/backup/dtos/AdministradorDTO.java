package pe.edu.upc.backup.dtos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class AdministradorDTO {
    private int idAdministador;

    private String usuario;

    private String correoElec;

    private String codigo;

    public int getIdAdministador() {
        return idAdministador;
    }

    public void setIdAdministador(int idAdministador) {
        this.idAdministador = idAdministador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
