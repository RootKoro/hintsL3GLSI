import java.util.Scanner;

public class TestConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String devise;

        try {
            do {
                System.out.print("Choisir la devise initiale (CFA / EURO) : ");
                devise = scan.next();
                devise.toLowerCase();
            } while (!(devise.contentEquals("euro") || devise.contentEquals("cfa")));

            System.out.print("Le montant a convertir : ");
            double montant = scan.nextDouble();

            MoneyConvertor convert = new MoneyConvertor(montant);

            if (devise.contentEquals("euro"))
                System.out
                        .println(convert.getMontant() + " " + devise.toUpperCase() + " : " + convert.toCfa() + " CFA");
            else
                System.out.println(
                        convert.getMontant() + " " + devise.toUpperCase() + " : " + convert.toEuro() + " EURO");

        } catch (Exception e) {
            System.out.println("Koro a trouver une petite erreur, ressayez avec en suivant bien les etapes ;-) !");
        }

        scan.close();
    }
}
