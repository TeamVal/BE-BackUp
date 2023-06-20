package pe.edu.upc.backup.entities;


import javax.persistence.*;


@Entity
@Table(name = "administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;


    @Column(name = "correo_elec", nullable = false)
    private String correoElec;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users users;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String correoElec, String codigo, Users users) {
        this.idAdministrador = idAdministrador;
        this.correoElec = correoElec;
        this.codigo = codigo;
        this.users = users;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
