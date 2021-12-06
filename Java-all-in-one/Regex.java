import java.util.Scanner;
/* import java.util.regex.*; */

public class Regex {

    public static void main(String[] args) {

        // String tels = "011234567";
        String regex = "^(33|70|76|77|78)[0-9]{7}?";
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un numero");
        String tel = sc.nextLine();
        // Regex regex2 = new Regex();
        // Pattern pattern = new Pattern();

        if (tel.matches(regex))
            System.out.println("Cool !");
        else
            System.out.println("Not Cool !");
        sc.close();
    }
}
