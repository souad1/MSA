package com.example.dktique.msa;

import java.util.Date;

/**
 * Created by DKTIQUE on 05/05/2016.
 */
public class Prospect {
    private String idProspect;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String numTelephone;
    private Integer numpoche;
    private Date dateProspect;
    private String id;
    private String numeroTel;

    //private String tuteur;
    //private String type_assurance;


    public Prospect() {
    }

    public Prospect(String nom, String prenom, Date dateNaissance, String numTelephone, Integer numpoche, Date dateProspect, String id, String numeroTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numTelephone = numTelephone;
        this.numpoche = numpoche;
        this.dateProspect = dateProspect;
        this.id = id;
        this.numeroTel = numeroTel;
    }

    public Prospect(String idProspect, String nom, String prenom, Date dateNaissance, String numTelephone, Integer numpoche, Date dateProspect, String id, String numeroTel) {
        this.idProspect = idProspect;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numTelephone = numTelephone;
        this.numpoche = numpoche;
        this.dateProspect = dateProspect;
        this.id = id;
        this.numeroTel = numeroTel;
    }

    public Prospect(String nom, String prenom, String numTelephone, Integer numpoche) {
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
        this.numpoche = numpoche;
    }

    public Prospect(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }




    public String getIdProspect() {
        return idProspect;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public Integer getNumpoche() {
        return numpoche;
    }

    public String getId() {
        return id;
    }

    public Date getDateProspect() {
        return dateProspect;
    }

    public String getNumeroTel() {
        return numeroTel;
    }


    public void setIdProspect(String idProspect) {
        this.idProspect = idProspect;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public void setNumpoche(Integer numpoche) {
        this.numpoche = numpoche;
    }

    public void setDateProspect(Date dateProspect) {
        this.dateProspect = dateProspect;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setId(String id) {
        this.id = id;
    }
}