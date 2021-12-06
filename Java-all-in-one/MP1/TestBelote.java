package MP1;

public class TestBelote {
    public static void main(String[] args) {
        Belote belote = new Belote();
        Carte[] playedCards = new Carte[4];
        int j = 0;

        while (belote.players.get(3).cartes.size() != 0) {
            playedCards[0] = belote.players.get(0).jouerEnPremier();
            System.out.println(belote.players.get(0).getNom());
            playedCards[0].printOut();
            for (int i = 1; i < 4; i++) {
                Joueur player = belote.players.get(i);
                System.out.println(player.getNom());
                playedCards[i] = player.play(playedCards[0].getSigne());
                playedCards[i].printOut();
                belote.players.set(i, player);
            }

            System.out.println("\n\nFin du tour " + ++j + "\n");

            for (int i = 0; i < 4; i++) {
                Joueur player = belote.players.get(i);
                player.tourGagnant(playedCards);
                belote.players.set(i, player);
            }
        }

        System.out.println("\n\nEND GAME");

        for (int i = 0; i < 4; i++) {
            Joueur player = belote.players.get(i);
            System.out.println(player.getNom());
            player.getScore();
        }
    }
}