package MP1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nom Joueur1 : ");
        Joueur player1 = new Joueur(scan.next());

        System.out.print("Nom Joueur2 : ");
        Joueur player2 = new Joueur(scan.next());

        System.out.print("Nom Joueur3 : ");
        Joueur player3 = new Joueur(scan.next());

        System.out.print("Nom Joueur4 : ");
        Joueur player4 = new Joueur(scan.next());

        ArrayList<Carte> cartes = new ArrayList<Carte>();

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

                cartes.add(new Carte(i, nom, j));
            }
        }

        for (; cartes.size() != 0;) {
            int randomCard = random.nextInt(cartes.size());
            player1.ajoutCarte(cartes.get(randomCard));
            cartes.remove(randomCard);

            randomCard = random.nextInt(cartes.size());
            player2.ajoutCarte(cartes.get(randomCard));
            cartes.remove(randomCard);

            randomCard = random.nextInt(cartes.size());
            player3.ajoutCarte(cartes.get(randomCard));
            cartes.remove(randomCard);

            randomCard = random.nextInt(cartes.size());
            player4.ajoutCarte(cartes.get(randomCard));
            cartes.remove(randomCard);
        }

        Carte card = new Carte();

        for (int i = 0; i < 13; i++) {
            System.out.print(player1.getNom() + " : ");
            try {
                card = player1.play(card.getSigne());
                card.printOut();
            } catch (NullPointerException npe) {
                card = player1.jouerEnPremier();
                card.printOut();
            }

            System.out.print(player2.getNom() + " : ");
            try {
                card = player2.play(card.getSigne());
                card.printOut();
            } catch (Exception e) {
                card = player2.jouerEnPremier();
                card.printOut();
            }

            System.out.print(player3.getNom() + " : ");
            try {
                card = player3.play(card.getSigne());
                card.printOut();
            } catch (Exception e) {
                card = player3.jouerEnPremier();
                card.printOut();
            }

            System.out.print(player4.getNom() + " : ");
            try {
                card = player4.play(card.getSigne());
                card.printOut();
            } catch (Exception e) {
                card = player4.jouerEnPremier();
                card.printOut();
            }

            System.out.println("\n\t\t\tFin du tour n-" + (i + 1) + "\n");
        }
        System.out.println("\nFin de partie!");
    }
}