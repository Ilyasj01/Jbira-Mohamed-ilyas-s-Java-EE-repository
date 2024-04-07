    package com.lus.dawm.eshop.model;

    import javax.persistence.*;
    import java.io.Serializable;

    @Entity
    public class Produit implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(
                strategy = GenerationType.AUTO
        )
        private int id;
        private String designation;
        private String description;
        private int qte;
        @ManyToOne
        private Categorie categorie;

        public Produit() {
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

        public int getQte() {
            return this.qte;
        }

        public void setQte(int qte) {
            this.qte = qte;
        }

        public Categorie getCategorie() {
            return this.categorie;
        }

        public void setCategorie(Categorie categorie) {
            this.categorie = categorie;
        }
    }
