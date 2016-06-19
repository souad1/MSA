package com.example.dktique.msa;

import java.util.Date;

/**
 * Created by DKTIQUE on 05/05/2016.
 */
public class Prospect {
    private String id_prospect;
    private String num_tel_tuteur;
    private String adresse;
    private String adresse_mail;
    private Date date_naissance;
    private Date date_prospect;
    private String nom;
    private String num_tel;
    private Integer numpoche;
    private String prenom;
    private String tuteur;
    private String type_assurance;


    public Prospect() {
    }

    public Prospect(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Prospect(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Prospect(String id_prospect, String num_tel_tuteur, String adresse, String adresse_mail, Date date_naissance, Date date_prospect, String nom, String num_tel, Integer numpoche, String prenom, String tuteur, String type_assurance) {
        this.id_prospect = id_prospect;
        this.num_tel_tuteur = num_tel_tuteur;
        this.adresse = adresse;
        this.adresse_mail = adresse_mail;
        this.date_naissance = date_naissance;
        this.date_prospect = date_prospect;
        this.nom = nom;
        this.num_tel = num_tel;
        this.numpoche = numpoche;
        this.prenom = prenom;
        this.tuteur = tuteur;
        this.type_assurance = type_assurance;
    }

    public Prospect(String num_tel_tuteur, String adresse, String adresse_mail, Date date_naissance, Date date_prospect, String nom, String  num_tel, Integer numpoche, String prenom, String tuteur, String type_assurance) {
        this.num_tel_tuteur = num_tel_tuteur;
        this.adresse = adresse;
        this.adresse_mail = adresse_mail;
        this.date_naissance = date_naissance;
        this.date_prospect = date_prospect;
        this.nom = nom;
        this.num_tel = num_tel;
        this.numpoche = numpoche;
        this.prenom = prenom;
        this.tuteur = tuteur;
        this.type_assurance = type_assurance;
    }

    public Prospect(String nom, String prenom, Integer numpoche) {
        this.nom = nom;
        this.prenom = prenom;
        this.numpoche = numpoche;
    }

    public String getId_prospect() {
        return id_prospect;
    }

    public String getNum_tel_tuteur() {
        return num_tel_tuteur;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public Date getDate_prospect() {
        return date_prospect;
    }

    public String getNom() {
        return nom;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public Integer getNumpoche() {
        return numpoche;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTuteur() {
        return tuteur;
    }

    public String getType_assurance() {
        return type_assurance;
    }


    public void setId_prospect(String id_prospect) {
        this.id_prospect = id_prospect;
    }

    public void setNum_tel_tuteur(String num_tel_tuteur) {
        this.num_tel_tuteur = num_tel_tuteur;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setDate_prospect(Date date_prospect) {
        this.date_prospect = date_prospect;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public void setNumpoche(Integer numpoche) {
        this.numpoche = numpoche;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    public void setType_assurance(String type_assurance) {
        this.type_assurance = type_assurance;
    }
}

