package folder;

public class Produit {
    private String nom;
    private int quantite;
    private double prixUnitaire;
    private double TVA;

    public Produit() {
    }

    public Produit(String nom, int quantite, double prixUnitaire) {
        setNom(nom);
        setQuantite(quantite);
        setPrixUnitaire(prixUnitaire);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantite(int quantite) {
        this.quantite = (quantite >= 0) ? quantite : 0;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = (prixUnitaire >= 0) ? prixUnitaire : 0;
        // this.TVA = this.prixUnitaire * 0.18;
        setTVA(prixUnitaire);
    }

    public void setTVA(double prixUnitaire) {
        this.TVA = prixUnitaire * 0.18;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getTVA() {
        return TVA;
    }
}