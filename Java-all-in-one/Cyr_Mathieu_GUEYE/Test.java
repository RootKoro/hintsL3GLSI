
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int longueur, largeur;
        String choix;

        // try {
        do {
            System.out.println(
                    "Que voulez vous dessiner?\nrectPlein - pour un rectangle plein\nrectCreux - pour un rectangle creux\ntriangle - pour un triangle isocele");
            choix = scan.next();
            choix = choix.toLowerCase();
        } while (!(choix.contentEquals("rectplein") || choix.contentEquals("rectcreux")
                || choix.contentEquals("triangle")));

        switch (choix) {
        case "rectplein":
            System.out.print("Longueur du rectangle : ");
            longueur = scan.nextInt();
            System.out.print("Largeur du rectangle : ");
            largeur = scan.nextInt();
            System.out.println();
            Dessin.rectanglePlein(longueur, largeur);
            break;

        case "rectcreux":
            System.out.print("Longueur du rectangle : ");
            longueur = scan.nextInt();
            System.out.print("Largeur du rectangle : ");
            largeur = scan.nextInt();
            System.out.println();
            Dessin.rectangleCreux(longueur, largeur);
            break;

        case "triangle":
            System.out.print("Hauteur du triangle : ");
            longueur = scan.nextInt();
            System.out.println();
            Dessin.triangleIsocele(longueur);
            break;
        }
        /*
         * } catch (Exception e) {
         * System.out.println("Reesayyez avec de bonnes valeurs ;-)!"); }
         */

        scan.close();
    }
}
