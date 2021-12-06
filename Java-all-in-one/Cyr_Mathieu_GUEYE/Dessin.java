
public class Dessin {
    public static void rectanglePlein(int longueur, int largeur) {
        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < largeur; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void rectangleCreux(int longueur, int largeur) {
        for (int i = 1; i < longueur; i++) {
            for (int j = 1; j < largeur; j++)
                if (i == 1 || i == longueur)
                    System.out.print("*");
                else {
                    if (j == 1 || j == largeur)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.println("");
        }
    }

    public static void triangleIsocele(int nombreLignes) {
        for (int i = 0; i < nombreLignes; i++) {
            for (int j = 0; j < (nombreLignes - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j < ((i + 1) * 2 - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
