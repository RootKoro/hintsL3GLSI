public class Somme {
    public static void main(String[] args) {

        int tab[] = { 1, 23, 12, -4, 6, 89, 2 };

        System.out.println("La somme du tableau donne : " + somme(tab) + "\nLe produit du tableau donne : "
                + produit(tab) + "\nLa moyenne du tableau est : " + moyenne(tab));
    }

    public static int somme(int[] tab) {

        int result = 0;

        for (int i = 0; i < tab.length; i++)
            result += tab[i];

        return result;
    }

    public static int produit(int[] tab) {

        int result = 1;

        for (int i = 0; i < tab.length; i++)
            result *= tab[i];

        return result;
    }

    public static float moyenne(int[] tab) {
        return (float) somme(tab) / tab.length;
    }
}
