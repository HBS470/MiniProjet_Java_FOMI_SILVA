package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Aéroports
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international de Paris");
        Aeroport jfk = new Aeroport("JFK", "New York", "Aéroport international de New York");

        // Avions
        Avion airbus = new Avion("F-ABCD", "Airbus A320", 180);

        // Vol
        Vol vol1 = new Vol("AF123", "Paris", "New York", "2025-04-17 08:00", "2025-04-17 20:00",airbus ,cdg, jfk);

        // Affectation de l'avion au vol
        airbus.affecterVol(vol1);

        // Personnel
        Pilote pilote = new Pilote( "Jean Dupont", "123 Rue de Paris", "jean@email.com",
                101, "2020-01-15", "PIL123", 5000);

        PersonnelCabine hotesse = new PersonnelCabine("Marie Martin", "456 Rue de Lyon", "marie@email.com",
                202, "2021-03-10", "Hotesse de l'air");

        // Affectation du personnel au vol
        pilote.affecterVol(vol1);
        hotesse.affecterVol(vol1);

        // Passager
        Passager passager = new Passager( "Sophie Dubois", "789 Rue de Marseille", "sophie@email.com", "PASS123");

        // Réservation
        Reservation reservation = passager.reserverVol(vol1, "2025-03-15");

        // Affichage des informations
        System.out.println("\n--- Informations du vol ---");
        System.out.println(vol1);

        System.out.println("\n--- Informations du pilote ---");
        System.out.println(pilote.obtenirInfos());

        System.out.println("\n--- Informations du passager ---");
        System.out.println(passager.obtenirInfos());

        System.out.println("\n--- Liste des passagers du vol ---");
        ArrayList<Passager> passagers = vol1.listingPassagers();
        for (Passager p : passagers) {
            System.out.println(p.getNom());
        }

        // Test des méthodes spécifiques
        System.out.println("\n--- Test des méthodes ---");
        reservation.confirmerReservation();
        vol1.modifierVol("2025-04-17 09:00", "2025-04-17 21:00");
        passager.annulerReservation(reservation.getNumeroReservation());
    }
}