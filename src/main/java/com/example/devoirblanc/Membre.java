package com.example.devoirblanc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Membre {
    public Membre(String nom,String prenom,String email,String phone){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phonoe=phone;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return id == membre.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, email, phonoe);
    }

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String phonoe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonoe() {
        return phonoe;
    }

    public void setPhonoe(String phonoe) {
        this.phonoe = phonoe;
    }


}
