import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Donner le nombre de notes : ");
        int nombreNotes = scan.nextInt(), i = 0, bestMarque = 0, worstMarque = 20, totalNote = 0;

        int[] Note = new int[nombreNotes];

        for (; i < nombreNotes; i++) {
            do {
                System.out.print("Donner la note numero " + (i + 1) + " : ");
                Note[i] = scan.nextInt();
            } while (Note[i] < 0 || Note[i] > 20);
        }

        for (i = 0; i < nombreNotes; i++) {

            if (Note[i] > bestMarque)
                bestMarque = Note[i];

            if (Note[i] < worstMarque)
                worstMarque = Note[i];

            totalNote += Note[i];
        }

        System.out.println("La meilleure note est : " + bestMarque + "\nLa pire note est : " + worstMarque
                + "\nLa moyenne generale est : " + ((float) totalNote / nombreNotes));
    }
}