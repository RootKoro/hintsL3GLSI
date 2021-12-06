package MP1;

import java.util.ArrayList;

public class Belotte {
    public ArrayList<Joueur> players = new ArrayList<>();
    public ArrayList<Carte> cards = new ArrayList<>();

    public Belotte(String player1, String player2, String player3, String player4) {
        players.add(new Joueur(player1));
        players.add(new Joueur(player2));
        players.add(new Joueur(player3));
        players.add(new Joueur(player4));

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                String nom = "";
                if (j < 11 && j > 0)
                    nom += j;
                else if (j == 11)
                    nom += "valet";
                else if (j == 12)
                    nom += "reine";
                else if (j == 13)
                    nom += "roi";

                cards.add(new Carte(i, nom, j));
            }
        }
    }
}
