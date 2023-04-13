package com.ProjetSpringBoot.FitCoach.controllers;

public class User {
    private String nom;
    private String prenom;
    private String email;
    private String mpd;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMpd() {
        return mpd;
    }

    public void setMpd(String mpd) {
        this.mpd = mpd;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", mpd='" + mpd + '\'' +
                '}';
    }

    public User(String nom, String prenom, String email, String mpd) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mpd = mpd;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
