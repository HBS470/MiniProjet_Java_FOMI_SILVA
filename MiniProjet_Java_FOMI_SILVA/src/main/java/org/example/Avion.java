package org.example;

import static java.lang.System.exit;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private Vol vol;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol(Vol vol){
        if (!verifierDisponibilite()){
            System.out.println("L'avion n'est pas disponible");
            exit(0);
        }
        this.vol = vol;
    }

    public boolean verifierDisponibilite(){
        return this.vol != null;
    }
}
