import java.util.Scanner;

public class Devin {
    public static void main(String[] args) {
        System.out.println("Pensez a un nombre entre 1 et 100.");
        System.out.println("La machine essayera de deviner le nombre mystere.");
        System.out.println(
                "Repondez lui \"plus\" si le nombre mystere est plus, \"moins\" si le nombre mystere est moin et \"oui\" s'il trouve !");

        Scanner scan = new Scanner(System.in);

        int inf = 1, sup = 100, middle = (inf + sup) / 2;
        String response;

        do {
            System.out.println("Est-ce " + middle + " ?");
            response = scan.next();
            if (response.contentEquals("plus"))
                inf = middle;
            else if (response.contentEquals("moins"))
                sup = middle;
            else if (response.contentEquals("oui"))
                break;
            else
                System.out.println("\'moins\', \'plus\' ou \'oui\' uniquement sont autorisees comme reponses");
            middle = (inf + sup) / 2;
        } while (inf < sup);

        if (response.contentEquals("oui"))
            System.out.println("Super, bravo a moi !!!");
        else
            System.out.println("Tricheur va !!!");
    }
}
