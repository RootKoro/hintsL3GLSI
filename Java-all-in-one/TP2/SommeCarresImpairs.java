public class SommeCarresImpairs {
    public static void main(String[] args) {
        if (args.length > 0) {
            int resultat = 0, impaire = 1, convertisseur = Integer.parseInt(args[0]);

            for (int i = 0; i < convertisseur; i++) {
                resultat += (impaire * impaire);
                impaire += 2;
            }

            System.out.println("La somme des " + args[0] + " nombres impaires est : " + resultat);
        } else
            System.out.println("Reessayez en passant un entier comme argument !");
    }
}
