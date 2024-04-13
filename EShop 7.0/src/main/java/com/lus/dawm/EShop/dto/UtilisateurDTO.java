package com.lus.dawm.EShop.dto;

import lombok.Data;

@Data
public class UtilisateurDTO{
public int id;
protected String nom, prenom, username, pwd;
public UtilisateurDTO(){

}
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id){
        this.id = id;
    }
}
