package pe.edu.upc.backup.dtos;

public class AsesorAsesoriaDTO {

    private String nom;
    private int asesoriaCount;

    public AsesorAsesoriaDTO() {
    }

    public AsesorAsesoriaDTO(String nom, int asesoriaCount) {
        this.nom = nom;
        this.asesoriaCount = asesoriaCount;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAsesoriaCount() {
        return asesoriaCount;
    }

    public void setAsesoriaCount(int asesoriaCount) {
        this.asesoriaCount = asesoriaCount;
    }
}
