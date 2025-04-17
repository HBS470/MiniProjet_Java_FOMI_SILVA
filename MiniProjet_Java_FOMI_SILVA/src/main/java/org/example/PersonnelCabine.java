package org.example;

public class PersonnelCabine extends Employe {
    private String qualification;

    // Constructeur
    public PersonnelCabine(String nom, String adresse, String contact,
                           int numeroEmploye, String dateEmbauche, String qualification) {
        super("PersonnelCabine", nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }
    public void affecterVol(Vol vol) {
        System.out.println("Le personnel de cabine " + getNom() + " a été affecté au vol " + vol.getNumeroVol());
    }

    public void obtenirVol(String numeroVol) {
        System.out.println("Obtention des informations du vol " + numeroVol + " pour le personnel de cabine " + getNom());
    }

    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() +
                "\nQualification: " + qualification;
    }
}
