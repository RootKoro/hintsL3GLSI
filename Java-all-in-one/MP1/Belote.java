package MP1;

import java.util.Random;
import java.util.ArrayList;

public class Belote {
    public ArrayList<Joueur> players = new ArrayList<>();
    public ArrayList<Carte> cards = new ArrayList<>();

    public Belote() {
        players.add(new Joueur("Doudou"));
        players.add(new Joueur("Lamine"));
        players.add(new Joueur("Fatou"));
        players.add(new Joueur("Dieynaba"));

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

        Random random = new Random();

        while (cards.size() != 0) {
            for (int i = 0; i < 4; i++) {
                int randomCard = random.nextInt(cards.size());
                Joueur player = players.get(i);
                player.ajoutCarte(cards.get(randomCard));
                players.set(i, player);
                cards.remove(randomCard);
            }
        }
    }
}
