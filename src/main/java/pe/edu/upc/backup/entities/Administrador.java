package pe.edu.upc.backup.entities;


import javax.persistence.*;


@Entity
@Table(name = "administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "correo_elec", nullable = false)
    private String correoElec;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String usuario, String correoElec, String codigo) {
        this.idAdministrador = idAdministrador;
        this.usuario = usuario;
        this.correoElec = correoElec;
        this.codigo = codigo;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
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
