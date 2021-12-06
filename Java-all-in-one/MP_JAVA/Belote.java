package MP_JAVA;

public class Belote {
    static Carte[] carte = new Carte[52];
    static Joueur[] joueur = new Joueur[4];

    public Belote() {
        this.joueur[0] = new Joueur("Doudou");
        this.joueur[1] = new Joueur("Lamine");
        this.joueur[2] = new Joueur("Fatou");
        this.joueur[3] = new Joueur("Dieynaba");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                String nom = "";
                if (j < 10 && j >= 0)
                    nom += (j + 1);
                else if (j == 10)
                    nom += "valet";
                else if (j == 11)
                    nom += "reine";
                else if (j == 12)
                    nom += "roi";

                carte[(i) * 13 + j] = new Carte(i + 1, nom, j + 1);
            }
        }

        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 4; i++) {
                joueur[i].ajoutCarte(carte[(i) * 13 + j]);
                carte[(i) * 13 + j] = null;
            }
        }
    }
}