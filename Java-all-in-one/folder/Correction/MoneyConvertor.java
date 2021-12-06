package Correction;

import java.util.Scanner;

public class MoneyConvertor {
    static double tauxConvertion = 548.91;

    static double toCfa(double montantEnDollar) {
        return montantEnDollar * tauxConvertion;
    }

    static double toDollar(double montantEnCfa) {
        return montantEnCfa / tauxConvertion;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String devise;
        double montant;

        try {
            do {
                System.out.print("Devise (Cfa / Dollar) : ");
                devise = scan.next();
                devise = devise.toLowerCase();
            } while (!(devise.contentEquals("cfa") || devise.contentEquals("dollar")));

            System.out.print("Montant : ");
            montant = scan.nextInt();

            if (devise.contentEquals("cfa"))
                System.out.println(montant + " Cfa => " + MoneyConvertor.toDollar(montant) + " Dollars");
            else
                System.out.println(montant + " Dollars => " + MoneyConvertor.toCfa(montant) + " Cfa");
        } catch (Exception e) {
            System.out.println("An error occured !");
        }
    }
}