package org.example;

import java.util.ArrayList;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Avion avion;
    private Aeroport depart;
    private Aeroport arrivee;
    private ArrayList<Reservation> reservations;

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, Avion avion, Aeroport depart, Aeroport arrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Planifié";
        this.avion = avion;
        this.depart = depart;
        this.arrivee = arrivee;
        this.reservations = new ArrayList<>();
    }

    public void planifierVol() {
        this.etat = "Planifié";
        System.out.println("Vol " + numeroVol + " planifié pour le " + dateHeureDepart);
    }

    public void annulerVol() {
        this.etat = "Annulé";
        for (Reservation reservation : reservations) {
            reservation.setStatut("Annulée");
        }
        System.out.println("Vol " + numeroVol + " annulé");
    }

    public void modifierVol(String nouveauDepart, String nouvelleArrivee) {
        this.dateHeureDepart = nouveauDepart;
        this.dateHeureArrivee = nouvelleArrivee;
        System.out.println("Vol " + numeroVol + " modifié: nouveau départ " + nouveauDepart);
    }
    public ArrayList<Passager> listingPassagers() {
        ArrayList<Passager> passagers = new ArrayList<>();
        for (Reservation reservation : reservations) {
            passagers.add(reservation.getPassager());
        }
        return passagers;
    }
    public String getNumeroVol() {
        return numeroVol;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    @Override
    public String toString() {
        return "Vol [numeroVol=" + numeroVol +
                ", origine=" + origine +
                ", destination=" + destination +
                ", départ=" + dateHeureDepart +
                ", arrivée=" + dateHeureArrivee +
                ", état=" + etat + "]";
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setDepart(Aeroport depart) {
        this.depart = depart;
    }

    public void setArrivee(Aeroport arrivee) {
        this.arrivee = arrivee;
    }
}
