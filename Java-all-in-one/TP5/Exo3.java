import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        System.out.print("Donnez un mot : ");
        Scanner scan = new Scanner(System.in);
        String mot = scan.next();
        int taille_mot = mot.length() - 1, nombreA = 0, nombreE = 0, nombreI = 0, nombreO = 0, nombreU = 0, nombreY = 0;

        for (; taille_mot >= 0; taille_mot--)
            if (mot.charAt(taille_mot) == 'a' || mot.charAt(taille_mot) == 'A')
                nombreA++;
            else if (mot.charAt(taille_mot) == 'e' || mot.charAt(taille_mot) == 'E')
                nombreE++;
            else if (mot.charAt(taille_mot) == 'i' || mot.charAt(taille_mot) == 'I')
                nombreI++;
            else if (mot.charAt(taille_mot) == 'o' || mot.charAt(taille_mot) == 'O')
                nombreO++;
            else if (mot.charAt(taille_mot) == 'u' || mot.charAt(taille_mot) == 'U')
                nombreU++;
            else if (mot.charAt(taille_mot) == 'y' || mot.charAt(taille_mot) == 'Y')
                nombreY++;

        System.out.println("Il comporte : \n" + nombreA + " fois le nombre a\n" + nombreE + " fois le nombre e\n"
                + nombreI + " fois le nombre i\n" + nombreO + " fois le nombre o\n" + nombreU + " fois le nombre u\n"
                + nombreY + " fois le nombre y");
    }
}
