import java.util.Scanner;

public class TestConjugaisonIndicatif {
    public static void main(String[] args) {
        String optionsMessage = "java TestConjugaisonIndicatif -v verbeAConjuguer pour avoir la conjugaison de verbeAConjuguer a tous les temps";
        optionsMessage += "\njava TestConjugaisonIndicatif -v verbeAConjuguer -t tempsDeConjugaison pour avoir la conjugaison de verbeAConjuguer au tempsDeConjugaison";
        optionsMessage += "\njava TestConjugaisonIndicatif pour y aller etape par etape";
        optionsMessage += "\njava TestConjugaisonIndicatif -h pour obtenir de l\'aide";
        String aideMessage = "Executez java TestConjugaisonIndicatif -h pour obtenir de l\'aide";

        if (args.length != 0) {
            if (args[0].contentEquals("-h"))
                System.out.println(optionsMessage);
            else if (args.length == 2) {
                if (args[0].contentEquals("-v")) {
                    String verbe = args[1].toLowerCase();
                    ConjugaisonIndicatif conjugaisonIndicatif = new ConjugaisonIndicatif(verbe);
                    if (conjugaisonIndicatif.getVerbe().contentEquals(verbe)) {
                        System.out.println("Present");
                        conjugaisonIndicatif.present();
                        System.out.println("\nImparfait");
                        conjugaisonIndicatif.imparfait();
                        System.out.println("\nPasse");
                        conjugaisonIndicatif.passe();
                        System.out.println("\nFutur");
                        conjugaisonIndicatif.futur();
                    }
                } else
                    System.out.println(aideMessage);
            } else if (args.length == 4) {
                if (args[0].contentEquals("-v") && args[2].contentEquals("-t")) {
                    String verbe = args[1].toLowerCase();
                    String temps = args[3].toLowerCase();
                    ConjugaisonIndicatif conjugaisonIndicatif = new ConjugaisonIndicatif(verbe);
                    if (conjugaisonIndicatif.getVerbe().contentEquals(verbe))
                        if (temps.contentEquals("present"))
                            conjugaisonIndicatif.present();
                        else if (temps.contentEquals("imparfait"))
                            conjugaisonIndicatif.imparfait();
                        else if (temps.contentEquals("passe"))
                            conjugaisonIndicatif.passe();
                        else if (temps.contentEquals("futur"))
                            conjugaisonIndicatif.futur();
                        else
                            System.out.println(aideMessage);
                } else
                    System.out.println(aideMessage);
            } else
                System.out.println(aideMessage);
        } else {
            Scanner scan = new Scanner(System.in);
            String verbe, temps, validation = "o";

            do {
                System.out.print("Entrez un verbe du premier groupe : ");
                verbe = scan.next();

                System.out.print("Choisissez un temps de l\'indicatif (present , passe , imparfait , futur) : ");
                temps = scan.next();

                System.out.print("Validation (o/n) : ");
                validation = scan.next();
                validation = validation.toLowerCase();
            } while (!(validation.contentEquals("o")));

            verbe = verbe.toLowerCase();
            temps = temps.toLowerCase();

            ConjugaisonIndicatif conjugue = new ConjugaisonIndicatif(verbe);

            if (temps.contains("present"))
                conjugue.present();
            else if (temps.contains("passe"))
                conjugue.passe();
            else if (temps.contains("imparfait"))
                conjugue.imparfait();
            else if (temps.contains("futur"))
                conjugue.futur();
            else
                System.out.println(aideMessage);
        }
    }
}