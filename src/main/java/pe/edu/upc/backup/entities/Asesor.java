package pe.edu.upc.backup.entities;


import javax.persistence.*;


@Entity
@Table(name = "asesores")
public class Asesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsesor;

    @Column(name = "ape", nullable = false)
    private String ape;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "tel", nullable = false)
    private int tel;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "arch", nullable = false)
    private String arch;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users users;

    public Asesor() {
    }

    public Asesor(int idAsesor, String ape, String nom, int tel, String correo, String arch, Users users) {
        this.idAsesor = idAsesor;
        this.ape = ape;
        this.nom = nom;
        this.tel = tel;
        this.correo = correo;
        this.arch = arch;
        this.users = users;
    }

    public int getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
