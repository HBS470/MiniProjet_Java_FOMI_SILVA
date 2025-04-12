package org.example;

public class Reservation {
    private static int compteur = 1;
    private int numeroReservation;
    private String dateReservation;
    private String statut;

    public Reservation( String dateReservation, String statut) {
        this.numeroReservation = compteur++;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public static void confirmerReservation(){

    }
    public static void modifierReservation(){

    }
    public static void annulerReservation(){

    }
}
