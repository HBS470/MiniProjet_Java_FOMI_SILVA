package org.example;

import java.util.ArrayList;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private ArrayList<Vol> depart;
    private ArrayList<Vol> arrivee;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.depart = new ArrayList<>();
        this.arrivee = new ArrayList<>();
    }

    public static void affecterVol(Vol vol){

    }
}
