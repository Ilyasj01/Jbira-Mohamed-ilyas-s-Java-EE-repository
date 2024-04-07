package com.lus.dawm.eshop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;
    private String designation;
    private String description;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
    @ManyToOne
    private Categorie parenCategorie;
    @OneToMany(mappedBy = "parenCategorie")
    private List<Categorie> subCategories;

    public Categorie() {
    }

    public List<Produit> getProduits() {
        return this.produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Categorie getParenCategorie() {
        return this.parenCategorie;
    }

    public void setParenCategorie(Categorie parenCategorie) {
        this.parenCategorie = parenCategorie;
    }

    public List<Categorie> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<Categorie> subCategories) {
        this.subCategories = subCategories;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
