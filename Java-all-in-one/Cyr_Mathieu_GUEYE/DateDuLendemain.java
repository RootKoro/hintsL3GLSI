
import java.util.Scanner;

public class DateDuLendemain {
    public static boolean estBissextile(int annee) {
        if (annee % 100 == 0)
            if (annee % 400 == 0)
                return true;
            else
                return false;
        else if (annee % 4 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String date, regex = "^((0[1-9])|([1-2][0-9])|(3[0-1]))/((0[1-9])|(1[0-2]))/[0-9]{4}";
        String wrongFeb = "3(0|1)/02/[0-9]{4}", wrong30 = "31/(04|06|09|11)/[0-9]{4}";
        Scanner scan = new Scanner(System.in);
        int annee, mois, jours;

        try {
            do {
                System.out.print("Entrez une date (format jj/mm/aaaa) : ");
                date = scan.next();
            } while (!(date.matches(regex)) || date.matches(wrong30) || date.matches(wrongFeb));

            jours = Integer.parseInt(date.charAt(0) + "" + date.charAt(1));
            mois = Integer.parseInt(date.charAt(3) + "" + date.charAt(4));
            annee = Integer.parseInt(date.charAt(6) + "" + date.charAt(7) + "" + date.charAt(8) + "" + date.charAt(9));

            switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (jours < 31)
                    jours++;
                else {
                    jours = 1;
                    mois++;
                }
                System.out.println("lendemain : " + jours + "/" + mois + "/" + annee);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (jours < 30)
                    jours++;
                else {
                    jours = 1;
                    mois++;
                }
                System.out.println("lendemain : " + jours + "/" + mois + "/" + annee);
                break;
            case 12:
                if (jours < 31)
                    jours++;
                else {
                    jours = 1;
                    mois = 1;
                    annee++;
                }
                System.out.println("lendemain : " + jours + "/" + mois + "/" + annee);
                break;
            case 2:
                if (jours < 29) {
                    if (estBissextile(annee))
                        jours++;
                    else {
                        jours = 1;
                        mois = 3;
                    }
                    System.out.println("lendemain : " + jours + "/" + mois + "/" + annee);
                } else {
                    if (estBissextile(annee)) {
                        jours = 1;
                        mois = 3;
                        System.out.println("lendemain : " + jours + "/" + mois + "/" + annee);
                    } else
                        System.out.println("Cet annee n'est pas bissextile, fevrier ne peut pas avoir 29 jours");
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("Erreur, reessayez plus tard !");
        }
    }
}