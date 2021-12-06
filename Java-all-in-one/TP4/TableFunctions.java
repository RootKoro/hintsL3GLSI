import java.util.Scanner;

class tab1leFunctions {

    static void saisir(int[] t) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < t.length; i++) {
            System.out.print("Saisir la valeur de l\'indice " + i + " du tableau : ");
            t[i] = scan.nextInt();
        }
    }

    static int somme(int[] t) {
        int somme = 0;

        for (int i = 0; i < t.length; i++)
            somme += t[i];

        return somme;
    }

    static int maximum(int[] t) {
        int max = t[0];

        for (int i = 0; i < t.length; i++)
            if (t[i] > max)
                max = t[i];

        return max;
    }

    static int delta(int[] t) {
        int max = t[0], min = t[0];

        for (int i = 0; i < t.length; i++)
            if (t[i] > max)
                max = t[i];
            else if (t[i] < min)
                min = t[i];

        return max - min;
    }

    static void bubble(int[] t) {
        int l = t.length, i = 0, j = l - 1;

        for (; i < l - 1; i++) {
            for (j = l - 1; j > i; j--) {
                if (t[i] > t[j]) {
                    int ech = t[i];
                    t[i] = t[j];
                    t[j] = ech;
                }
            }
        }
    }

    static boolean egalite(int[] t1, int[] t2) {
        if (t1.length != t2.length)
            return false;
        else
            for (int i = 0; i < t1.length; i++)
                if (t1[i] != t2[i])
                    return false;
                else
                    continue;
        return true;
    }

    static boolean equivalence(int[] t1, int[] t2) {
        boolean equality = false;

        if (t1.length == t2.length) {
            for (int i = 0; i < t1.length; i++) {
                for (int j = 0; j < t2.length; j++)
                    if (t1[i] == t2[j]) {
                        equality = true;
                        break;
                    } else
                        continue;

                if (equality == false)
                    return false;
                else {
                    equality = false;
                    continue;
                }
            }
            return true;
        } else if (t1.length > t2.length) {
            for (int i = 0; i < t2.length; i++) {
                for (int j = 0; j < t1.length; j++)
                    if (t2[i] == t1[j]) {
                        equality = true;
                        break;
                    } else
                        continue;

                if (equality == false)
                    return false;
                else {
                    equality = false;
                    continue;
                }
            }
            return true;
        } else {
            for (int i = 0; i < t1.length; i++) {
                for (int j = 0; j < t2.length; j++)
                    if (t1[i] == t2[j]) {
                        equality = true;
                        break;
                    } else
                        continue;

                if (equality == false)
                    return false;
                else {
                    equality = false;
                    continue;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[] tab1 = new int[5], tab2 = new int[5], tab3 = new int[7];

        System.out.println("Tableau : tab1 ->");
        saisir(tab1);

        System.out.println("Somme des elements du tableau : " + somme(tab1) + "\nLa valeur maximal du tableau : "
                + maximum(tab1) + "\nLa difference entre le maximum et le minimun : " + delta(tab1));

        System.out.print("tableau avant tri : {");
        for (int i = 0; i < tab1.length - 1; i++)
            System.out.print(tab1[i] + " , ");
        System.out.print(tab1[tab1.length - 1] + "}");

        bubble(tab1);

        System.out.print("\ntableau apres tri : {");
        for (int i = 0; i < tab1.length - 1; i++)
            System.out.print(tab1[i] + " , ");
        System.out.print(tab1[tab1.length - 1] + "}");

        System.out.println("\nTableau : tab2 ->");
        saisir(tab2);

        System.out.println("egalite (tab1 , tab2) : " + egalite(tab1, tab2));

        System.out.println("Tableau : tab3 ->");
        saisir(tab3);

        System.out.println("equivalence (tab2 , tab3) : " + equivalence(tab2, tab3));

    }
}