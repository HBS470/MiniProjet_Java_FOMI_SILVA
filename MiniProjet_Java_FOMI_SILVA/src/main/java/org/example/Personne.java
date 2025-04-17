package org.example;

public abstract class Personne {
    protected String identifiant;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }
    public String obtenirInfos(){
        return "Identifiant: " + identifiant +
                "\nNom: " + nom +
                "\nAdresse: " + adresse +
                "\nContact: " + contact;
    }

    public String getNom() {
        return nom;
    }
}
