package org.example;

import java.util.ArrayList;

public class Passager extends Personne {
    private String passeport;
    private ArrayList<Reservation> reservations;

    public Passager(String nom, String adresse, String contact, String passeport) {
        super("Passager", nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public Reservation reserverVol(Vol vol, String dateReservation) {
        Reservation reservation = new Reservation(
                "RES" + System.currentTimeMillis(),
                dateReservation,
                "Confirmée",
                this,
                vol
        );
        reservations.add(reservation);
        System.out.println("Réservation effectuée pour le vol " + vol.getNumeroVol() + " par " + getNom());
        return reservation;
    }

    public Reservation obtenirReservation(String numeroReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation().equals(numeroReservation)) {
                return reservation;
            }
        }
        return null;
    }
    public void annulerReservation(String numeroReservation ) {
        for (Reservation reservation : reservations) {
            if (reservation.getNumeroReservation().equals(numeroReservation)) {
                reservation.setStatut("Annulée");
                System.out.println("Réservation " + numeroReservation + " annulée pour " + getNom());
                return;
            }
        }
    }
    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() +
                "\nPasseport: " + passeport +
                "\nNombre de réservations: " + reservations.size();
    }


}
