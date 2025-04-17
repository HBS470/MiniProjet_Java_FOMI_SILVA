package org.example;

public abstract class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(String identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole(){
        return identifiant;
    }

    @Override
    public String obtenirInfos() {
        return super.obtenirInfos() +
                "\nNuméro Employé: " + numeroEmploye +
                "\nDate Embauche: " + dateEmbauche +
                "\nRôle: " + obtenirRole();
    }
}
