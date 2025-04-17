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

    public void affecterVol(Vol vol, boolean estDepart) {
        if (estDepart) {
            vol.setDepart(this);
            depart.add(vol);
            System.out.println("Vol " + vol.getNumeroVol() + " affecté au départ de l'aéroport " + nom);
        } else {
            vol.setArrivee(this);
            arrivee.add(vol);
            System.out.println("Vol " + vol.getNumeroVol() + " affecté à l'arrivée à l'aéroport " + nom);
        }
    }
}
