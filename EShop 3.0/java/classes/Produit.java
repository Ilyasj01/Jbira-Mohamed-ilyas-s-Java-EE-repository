package classes;

import java.io.Serializable;

public class Produit implements Serializable {
    private Long id;
    private String description;
    private int qte;
    private String designation;

    public Produit(String description, int qte, String designation) {
        this.designation = designation;
        this.qte = qte;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQte() {
        return this.qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
