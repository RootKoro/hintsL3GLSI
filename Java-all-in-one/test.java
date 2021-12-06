import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entier = scan.nextInt(), i = entier, chiffres = 0;

        if (entier == 0)
            System.out.println(1);
        else {
            for (; i > 0;) {
                i /= 10;
                chiffres++;
            }
            System.out.println(chiffres);
        }
        /**
         * int nombre[chiffres.size()], i = 0; System.out.println(nombre.length); for(;i
         * < chiffres.size();) nombre[i] = chiffres.get(i);
         */
    }
}
