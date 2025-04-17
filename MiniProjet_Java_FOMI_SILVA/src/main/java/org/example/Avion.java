package org.example;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private ArrayList<Vol> vols;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.vols = new ArrayList<>();
    }

    public void affecterVol(Vol vol) {
        if (verifierDisponibilite(vol.getDateHeureDepart(), vol.getDateHeureArrivee())) {
            vol.setAvion(this);
            vols.add(vol);
            System.out.println("Avion " + immatriculation + " affecté au vol " + vol.getNumeroVol());
        } else {
            System.out.println("Avion " + immatriculation + " non disponible pour le vol " + vol.getNumeroVol());
        }
    }

    public boolean verifierDisponibilite(String dateHeureDepart, String dateHeureArrivee) {
        for (Vol vol : vols) {
            if (vol.getDateHeureDepart().equals(dateHeureDepart) ||
                    vol.getDateHeureArrivee().equals(dateHeureArrivee)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avion [immatriculation=" + immatriculation + ", modele=" + modele + ", capacite=" + capacite + "]";
    }


}
