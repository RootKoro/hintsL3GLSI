package Correction;

public class MoyenneArithmetique {
    public static void main(String[] args) {
        try {
            double moyenneArithmetique = 0;
            for (int i = 0; i < args.length; i++)
                moyenneArithmetique += Integer.parseInt(args[i]);
            moyenneArithmetique = moyenneArithmetique / 3;
            System.out.println("Moyenne arithmetique (" + args[0] + " , " + args[1] + " , " + args[2] + ") = "
                    + moyenneArithmetique);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Try again with 3 args ;-) !");
        }
    }
}
