package org.example;

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

    public Vol(String numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat, Avion avion, Aeroport depart, Aeroport arrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.avion = avion;
        this.depart = depart;
        this.arrivee = arrivee;
    }

    public static void planiifierVol(){

    }
    public static void modifierVol(){

    }
    public static void annulerVol(){

    }
}
