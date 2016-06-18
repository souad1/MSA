package com.example.dktique.msa;

import java.io.Serializable;

/**
 * Created by DKTIQUE on 03/05/2016.
 */
public class Poche implements Serializable {

    private String nom;
    private String description;
    private String diametre;
    private String prix;
    private int cover;
    private int iconCover;

    public Poche() {
    }

    public Poche(String nom, String description, String diametre, String prix, int cover, int iconCover) {
        this.nom = nom;
        this.description = description;
        this.diametre = diametre;
        this.prix = prix;
        this.cover = cover;
        this.iconCover = iconCover;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public String getDiametre() {
        return diametre;
    }

    public String getPrix() {
        return prix;
    }

    public int getCover() {
        return cover;
    }

    public int getIconCover() {
        return iconCover;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiametre(String diametre) {
        this.diametre = diametre;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setIconCover(int iconCover) {
        this.iconCover = iconCover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
