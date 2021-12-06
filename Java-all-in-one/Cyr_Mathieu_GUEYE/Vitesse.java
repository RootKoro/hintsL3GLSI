
import java.util.Scanner;

public class Vitesse {
    private int distance;
    private int temps;

    public Vitesse(int distance, int temps) {
        setDistance(distance);
        setTemps(temps);
    }

    public int getDistance() {
        return distance;
    }

    public int getTemps() {
        return temps;
    }

    public void setDistance(int distance) {
        // this.distance = (distance >= 0) ? distance : 0;
        if (distance >= 0)
            this.distance = distance;
        else
            this.distance = 0;
    }

    public void setTemps(int temps) {
        if (temps > 0)
            this.temps = temps;
        else
            this.temps = 1;

    }

    public double metreParSeconde() {
        double vitesse = (double) this.distance / this.temps;
        return vitesse;
    }

    public double kilometreParheure() {
        double vitesse = metreParSeconde() * 3.6;
        return vitesse;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // try {
        System.out.print("Distance (en m): ");
        int distance = scan.nextInt();

        System.out.print("Temps (en s): ");
        int temps = scan.nextInt();

        Vitesse vitesse = new Vitesse(distance, temps);
        String choix;

        do {
            System.out.print("Voulez vous la vitesse en kilometre par heure (kph) ou en metre par seconde (mps) ? ");
            choix = scan.next();
            choix = choix.toLowerCase();
        } while (!(choix.contentEquals("kph") || choix.contentEquals("mps")));

        if (choix.contentEquals("kph"))
            System.out.println("Vitesse : " + vitesse.kilometreParheure());
        else
            System.out.println(
                    "Vitesse : " + vitesse.metreParSeconde());/*
                                                               * } catch (Exception e) { System.out.
                                                               * println("reessayer avec de bonnes valeurs ;-) !"); }
                                                               */

        scan.close();
    }
}
