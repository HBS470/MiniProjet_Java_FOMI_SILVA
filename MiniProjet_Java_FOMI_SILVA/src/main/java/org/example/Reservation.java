package org.example;

import java.util.ArrayList;

public class Reservation {
    private String numeroReservation;
    private String dateReservation;
    private String statut;
    private Vol vol;
    private Passager passager;

    public Reservation(String numeroReservation, String dateReservation, String statut, Passager passager, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.passager = passager;
        this.vol = vol;
        // Ajouter cette réservation à la liste des réservations du vol
        if (vol != null) {
            vol.getReservations().add(this);
        }
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " confirmée pour " + passager.getNom());
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("Réservation " + numeroReservation + " annulée pour " + passager.getNom());
    }

    public void modifierReservation(Vol nouveauVol) {
        // Retirer cette réservation de l'ancien vol
        if (this.vol != null) {
            this.vol.getReservations().remove(this);
        }

        // Mettre à jour le vol
        this.vol = nouveauVol;

        // Ajouter cette réservation au nouveau vol
        if (nouveauVol != null) {
            nouveauVol.getReservations().add(this);
        }

        System.out.println("Réservation " + numeroReservation + " modifiée pour " + passager.getNom() +
                ", nouveau vol: " + nouveauVol.getNumeroVol());
    }
    public String getNumeroReservation() {
        return numeroReservation;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Passager getPassager() {
        return passager;
    }
    @Override
    public String toString() {
        return "Reservation [numeroReservation=" + numeroReservation +
                ", dateReservation=" + dateReservation +
                ", statut=" + statut +
                ", passager=" + (passager != null ? passager.getNom() : "null") +
                ", vol=" + (vol != null ? vol.getNumeroVol() : "null") + "]";
    }
}
