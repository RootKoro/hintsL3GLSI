package MP_JAVA;

public class Joueur {
    private String nom;
    private int score;
    private int compteur;
    private Carte cartejouer;
    public Carte[] carte;

    // setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    // getters
    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public Joueur(String name) {
        this.nom = name;
        this.score = 0;
        this.compteur = 0;
        this.carte = new Carte[13];
    }

    public void ajoutCarte(Carte carte) {
        this.carte[compteur] = carte;
        this.compteur++;
    }

    public Carte jouerEnPremier() {
        if (this.compteur != 0) {
            for (int i = compteur - 1; i >= 0; i--) {
                if (!(this.carte[i].equals(null))) {
                    cartejouer = this.carte[i];
                    this.carte[i] = null;
                    System.out.println(compteur);
                    this.compteur--;
                    return cartejouer;
                }
            }
        }
        return null;
    }

    public Carte play(int signe) {
        if (this.compteur != 0) {
            for (int i = 0; i < this.carte.length; i++) {
                try {
                    if (this.carte[i].getSigne() == signe) {
                        cartejouer = this.carte[i];
                        this.carte[i] = null;
                        this.compteur--;
                        return cartejouer;
                    } // else if (!(this.carte[i].equals(null))) {
                      // jouerEnPremier();
                      // }
                } catch (NullPointerException e) {
                    continue;
                }
                System.out.println(i + " " + compteur);
            }
        }
        return null;
    }

    public void tourGagnant(Carte[] carte) {
        Carte CarteMaximum = new Carte(carte[0].getSigne(), carte[0].getNom(), carte[0].getValeur());
        for (int i = 0; i < carte.length; i++) {
            if (carte[i].getValeur() > CarteMaximum.getValeur())
                CarteMaximum = carte[i];
            if (CarteMaximum.equals(cartejouer))
                this.score += carte[i].getValeur();
        }
    }
}