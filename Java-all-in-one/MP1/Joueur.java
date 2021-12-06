package MP1;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private int score = 0;
    private int carteCompteur = 0;
    protected ArrayList<Carte> cartes = new ArrayList<Carte>();
    private Carte carteJouei = new Carte();

    public Joueur(String nom) {
        this.nom = nom;
    }

    public void ajoutCarte(Carte carte) {
        this.carteCompteur++;
        this.cartes.add(carte);
    }

    public Carte jouerEnPremier() {
        if (carteCompteur != 0) {
            if (!(cartes.get(carteCompteur - 1).equals(null))) {
                this.carteJouei = this.cartes.get(--carteCompteur);
                this.cartes.remove(carteCompteur);
                return this.carteJouei;
            }
        }
        return null;
    }

    public Carte play(int signe) {
        if (this.carteCompteur > 0) {
            for (int i = 0; i < carteCompteur; i++) {
                try {
                    if (this.cartes.get(i).getSigne() == signe) {
                        this.carteJouei = this.cartes.get(i);
                        this.cartes.remove(i);
                        this.carteCompteur--;
                        return this.carteJouei;
                    } else if (this.cartes.get(i).getSigne() != signe)
                        jouerEnPremier();
                } catch (NullPointerException e) {
                    continue;
                }
            }
        }
        return null;
    }

    public void tourGagnant(Carte[] cartes) {
        Carte carteMax = new Carte(cartes[0]);
        for (int i = 0; i < cartes.length; i++)
            if (cartes[i].getValeur() > carteMax.getValeur() && cartes[i].getSigne() == cartes[0].getSigne())
                carteMax = cartes[i];
        if (carteMax == carteJouei)
            for (int i = 0; i < 4; i++)
                this.score += cartes[i].getValeur();
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int getCarteCompteur() {
        return carteCompteur;
    }

    public void scoreCompteur(int valeur) {
        this.score += valeur;
    }
}