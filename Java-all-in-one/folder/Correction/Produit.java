package Correction;

public class Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

    public Produit() {
    }

    public Produit(String nom, double prixUnitaire, int quantite) {
        setNom(nom);
        setPrixUnitaire(prixUnitaire);
        setQuantite(quantite);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = (prixUnitaire >= 1) ? prixUnitaire : 0;
    }

    public void setQuantite(int quantite) {
        this.quantite = (quantite >= 0) ? quantite : 0;
    }
}
