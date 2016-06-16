package com.example.dktique.msa;

import java.util.Date;

/**
 * Created by DKTIQUE on 05/05/2016.
 */
public class Prospect {
    private String Id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String numTelephone;
    private String numpoche;




    public Prospect() {
    }

    public Prospect(String id, String nom, String prenom, String dateNaissance, String numTelephone, String numpoche) {
        Id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numTelephone = numTelephone;
        this.numpoche = numpoche;
    }

    public Prospect(String nom, String prenom, String dateNaissance, String numTelephone, String numpoche) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numTelephone = numTelephone;
        this.numpoche = numpoche;
    }

    public Prospect(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }





    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }



    public String getNumTelephone() {
        return numTelephone;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNumpoche(String numpoche) {
        this.numpoche = numpoche;
    }

    public String getId() {

        return Id;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getNumpoche() {
        return numpoche;
    }
}