package TP3;

public class TestComplexe {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(), c2 = new Complexe(8, 17), c3 = new Complexe(c2);

        System.out.println("C1 = " + c1.toString() + "\nC2 = " + c2.toString() + "\nC3 = " + c3.toString());

        c1.setPartieReelle(12);
        c1.setPartieImaginaire(9);
        c2.ajouter(c1);
        c3.soustraire(c1);

        System.out.println("\nC1 = " + c1.toString() + "\nC2 = " + c2.toString() + "\nC3 = " + c3.toString());
    }
}
