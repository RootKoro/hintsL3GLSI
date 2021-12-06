import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("taille du tableau");
        int lt = scan.nextInt();

        int[] tb = new int[lt];

        for (int i = 0; i < lt; i++) {
            System.out.println("element d\'indice " + i);
            tb[i] = scan.nextInt();

        }
        bubble(tb);
    }

    public static void bubble(int[] t) {
        int l = t.length, i = 0, j = l - 1;

        for (; i < l; i++) {
            for (; j > i; j--) {
                if (t[i] > t[j]) {
                    int ech = t[i];
                    t[i] = t[j];
                    t[j] = ech;
                }
            }
        }
    }
}
