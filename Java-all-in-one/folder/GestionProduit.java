package folder;

import java.util.Scanner;

public class GestionProduit {
    public static void main(String[] args) {
        Produit gloria = new Produit("gloria", 2, 500);
        Produit produit = new Produit();

        Scanner scan = new Scanner(System.in);

        System.out.println("Essaie\nProduit numero 1 (" + gloria.getNom() + " [quantite : " + gloria.getQuantite()
                + " ; prix unitaire : " + gloria.getPrixUnitaire() + "])");

        System.out.print("Nom du nouveau produit : ");
        String nom = scan.nextLine();
        produit.setNom(nom);

        System.out.print("Quantite : ");
        int quantite = scan.nextInt();
        produit.setQuantite(quantite);

        System.out.print("Prix unitaire (en FCFA) : ");
        double prixUnitaire = scan.nextDouble();
        produit.setPrixUnitaire(prixUnitaire);

        System.out.println("Produit : " + produit.getNom());
        System.out.println("Prix HT : " + produit.getPrixUnitaire() + " CFA");
        System.out.println("TVA : " + produit.getTVA() + " CFA");
        System.out.println("Prix TTC : " + (produit.getPrixUnitaire() + produit.getTVA()) + " CFA");

        scan.close();
    }
}
