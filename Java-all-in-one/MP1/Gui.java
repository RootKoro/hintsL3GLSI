package MP1;

import java.util.Random;
import java.util.Scanner;

public class Gui {
    private static int signeConvert(String signe) {
        int convert = 0;
        if (signe.contentEquals("pique"))
            convert = 2;
        else if (signe.contentEquals("coeur"))
            convert = 3;
        else if (signe.contentEquals("trefle"))
            convert = 1;
        else if (signe.contentEquals("carreau"))
            convert = 4;
        else
            return 0;
        return convert;
    }

    public static String nameVerif(String nom) {
        if (nom.contentEquals("1") || nom.contentEquals("2") || nom.contentEquals("3") || nom.contentEquals("4")
                || nom.contentEquals("5") || nom.contentEquals("6") || nom.contentEquals("7") || nom.contentEquals("8")
                || nom.contentEquals("9") || nom.contentEquals("10") || nom.contentEquals("roi")
                || nom.contentEquals("reine") || nom.contentEquals("valet"))
            return nom;
        else
            return "nope";
    }

    public static void main(String[] args) {
        try {
            Random random = new Random();
            int j = 0;
            Scanner scan = new Scanner(System.in);
            if (args.length >= 4) {
                Belotte init = new Belotte(args[0], args[1], args[2], args[3]);

                System.out.println("\nDistribution des cartes!\n");

                while (init.cards.size() != 0) {
                    for (int i = 0; i < 4; i++) {
                        int randomCard = random.nextInt(init.cards.size());
                        Joueur player = init.players.get(i);
                        player.ajoutCarte(init.cards.get(randomCard));
                        init.players.set(i, player);
                        init.cards.remove(randomCard);
                    }
                }

                System.out.println("\nDistribution des cartes faite !\n");

                while (init.players.get(3).cartes.size() != 0) {
                    Carte carteAJouer = new Carte();
                    Carte[] cartesTour = new Carte[4];
                    for (int i = 0; i < 4; i++) {
                        Joueur player = init.players.get(i);
                        System.out.println("\n" + player.getNom());
                        for (int k = 0; k < player.cartes.size(); k++)
                            player.cartes.get(k).printOut();
                        Carte previousCard = new Carte(carteAJouer);
                        do {
                            int conv, l = 0;
                            String nomCarte;
                            boolean innerCard = false;
                            do {
                                String resp = "";
                                nomCarte = "";
                                System.out.print("Choisir la carte a jouer(ex : 5 de pique) : ");
                                String crt = scan.nextLine();
                                for (int a = crt.length() - 1; crt.charAt(a) != ' ' && a >= 0; a--)
                                    resp += crt.charAt(a);
                                String rep = "";
                                for (int a = resp.length() - 1; a >= 0; a--)
                                    rep += resp.charAt(a);
                                for (int a = 0; crt.charAt(a) != ' ' && a <= crt.length(); a++)
                                    nomCarte += crt.charAt(a);
                                conv = signeConvert(rep);
                                nomCarte = nameVerif(nomCarte);
                            } while (conv == 0 && nomCarte.contentEquals("nope"));
                            carteAJouer.setSigne(conv);
                            carteAJouer.setNom(nomCarte);
                            carteAJouer.setValeur();
                            for (; l < player.cartes.size(); l++) {
                                if (carteAJouer.equals(player.cartes.get(l))) {
                                    if (player.getNom().equals(init.players.get(0).getNom())
                                            || carteAJouer.getSigne() == previousCard.getSigne()) {
                                        innerCard = true;
                                        break;
                                    } else if (carteAJouer.getSigne() != previousCard.getSigne()) {
                                        boolean exists = false;
                                        for (int k = 0; k < player.cartes.size(); k++) {
                                            if (player.cartes.get(k).getSigne() == previousCard.getSigne()) {
                                                exists = true;
                                                break;
                                            }
                                        }
                                        if (exists == false) {
                                            innerCard = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (innerCard == true) {
                                player.scoreCompteur(carteAJouer.getValeur());
                                cartesTour[i] = player.cartes.get(l);
                                player.cartes.remove(l);
                                break;
                            }
                        } while (true);
                    }
                }
            } else {
                System.out.print("Joueur1 entrez votre nom : ");
                String p1 = scan.next();
                System.out.print("Joueur2 entrez votre nom : ");
                String p2 = scan.next();
                System.out.print("Joueur3 entrez votre nom : ");
                String p3 = scan.next();
                System.out.print("Joueur4 entrez votre nom : ");
                Belotte init = new Belotte(p1, p2, p3, scan.next());

                while (init.cards.size() != 0) {
                    for (int i = 0; i < 4; i++) {
                        int randomCard = random.nextInt(init.cards.size());
                        Joueur player = init.players.get(i);
                        player.ajoutCarte(init.cards.get(randomCard));
                        init.players.set(i, player);
                        init.cards.remove(randomCard);
                    }
                }

                while (init.players.get(3).cartes.size() != 0) {
                    for (int i = 0; i < 4; i++) {
                        Joueur player = init.players.get(i);
                        System.out.print(player.getNom());
                        player.jouerEnPremier().printOut();
                        init.players.set(i, player);
                    }

                    System.out.println("\n\nFin du tour " + ++j + "\n");
                }

                System.out.println("\n\nEND GAME");
            }
        } catch (Exception e) {
            System.out.println("\nUne erreur s'est produite lors de l'execution du programme !\nbye bye ;)");
        }
    }
}