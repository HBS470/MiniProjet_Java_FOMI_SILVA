package org.example;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    // Constructeur
    public Pilote(String nom, String adresse, String contact,
                  int numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
        super("Pilote", nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol(Vol vol) {
        System.out.println("Le pilote " + getNom() + " a été affecté au vol " + vol.getNumeroVol());
    }

    public void obtenirVol(String numeroVol) {
        System.out.println("Obtention des informations du vol " + numeroVol + " pour le pilote " + getNom());
    }
    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() +
                "\nLicence: " + licence +
                "\nHeures de Vol: " + heuresDeVol;
    }
}
