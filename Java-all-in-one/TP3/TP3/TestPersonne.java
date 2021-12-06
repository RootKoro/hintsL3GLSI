package TP3;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne("ton", "ton");
        Personne p3 = new Personne("ton", "ton", 23);
        Personne p4 = new Personne("ton", "ton", 34, Sexe.feminin);
        Personne p5 = new Personne(p4);

        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString() + "\n" + p4.toString() + "\n"
                + p5.toString());
    }
}