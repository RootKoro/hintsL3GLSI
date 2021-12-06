import java.util.Scanner;
//import java.util.regex.*;

public class DateDuLendemain {

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

            String format = "";

            jours = Integer.parseInt(date.charAt(0) + "" + date.charAt(1));
            mois = Integer.parseInt(date.charAt(3) + "" + date.charAt(4));
            annee = Integer.parseInt(date.charAt(6) + "" + date.charAt(7) + "" + date.charAt(8) + "" + date.charAt(9));

            if (jours <= 27) {
                format = (++jours) + "/" + mois + "/" + annee;
                System.out.println("Le lendemain de " + date + " est : " + format);
            } else if (jours == 28 && mois == 2) {
                if (estBissextile(annee)) {
                    format = (++jours) + "/" + mois + "/" + annee;
                    System.out.println("Le lendemain de " + date + " est : " + format);
                } else {
                    format = "01/03/" + annee;
                    System.out.println("Le lendemain de " + date + " est : " + format);
                }
            } else {
                switch (jours) {
                case 29:
                    switch (mois) {
                    case 2:
                        if (estBissextile(annee)) {
                            format = "01/03/" + annee;
                            System.out.println("Le lendemain de " + date + " est : " + format);
                        } else
                            System.out.println("That year's not bissextil, February can't have 29 days");
                        break;

                    default:
                        format = (++jours) + "/" + mois + "/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;
                    }
                    break;

                case 30:
                    switch (mois) {
                    case 4:
                        format = "05/03/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;

                    case 6:
                        format = "06/03/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;

                    case 9:
                        format = "10/03/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;

                    case 11:
                        format = "12/03/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;
                    default:
                        format = (++jours) + "/" + mois + "/" + annee;
                        System.out.println("Le lendemain de " + date + " est : " + format);
                        break;
                    }

                case 31:
                    if (mois == 12)
                        format = "01/01/" + (++annee);
                    else
                        format = (++jours) + "/" + mois + "/" + annee;
                    System.out.println("Le lendemain de " + date + " est : " + format);

                default:
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured while running the programme, try again ;-) !");
        }

        scan.close();
    }

    public static boolean estBissextile(int annee) {
        if (annee % 100 == 0)
            return (annee % 400 == 0);
        return (annee % 4 == 0);
    }
}