import java.util.Scanner;

//Dans l'algorithme qui suit:
//TAILLE(chaine) renvoie la taille de la chaine de caractère chaine
//SSCHAINE(chaine/i/j) renvoie j caractères à partir du caractère à la position i de la chaine de caractère chaine
//SORTIR permet de sortir d'une boucle

/*
ALGORITHME : Palindrome 

    VARIABLES :
        i, j, taille_mot : ENTIER
        mot : CHAINE
        palindrome : BOOLEEN

    DEBUT :

        palindrome <- VRAI

        ECRIS : "Entrez le mot : "
        LIS : mot

        taille_cont <- TAILLE(mot)
        i <- 0
        j <- TAILLE(mot)

        REPETER

            SI (SSCHAINE(mot/i/1) <> SSCHAINE(mot/j/1)) ALORS
                palindrome = FAUX
                SORTIR
            FIN SI

            i <- i + 1
            j <- j - 1
        JUSQUA (i = (taille_cont / 2))

        SI (palindrome = VRAI) ALORS
            ECRIS : "Le mot est un palindrome !"
        SINON
            ECRIS : "Le mot n\'est pas un palidrome !"
        FIN SI
*/
public class Palindrome {
	public static void main(String[] args) {

		if (args.length > 0)
			System.out.println(args[0] + " : palindrome = " + motPalindrome(args[0]));
		else {
			Scanner scan = new Scanner(System.in);

			System.out.print("Entrer un entier : ");
			int entier = scan.nextInt(), q = entier, chiffres = 0, i = 0;

			if (-10 < entier && entier < 10)
				System.out.println(entier + " : palindrome = true");
			else {
				do {
					q /= 10;
					chiffres++;
				} while (q > 0);

				q = entier;
				int[] nombre = new int[chiffres];
				do {
					nombre[i] = q % 10;
					q /= 10;
					i++;
				} while (q > 0);
				System.out.println(entier + " : palindrome = " + entierPalindrome(nombre));
			}
		}
	}

	public static boolean entierPalindrome(int[] tab) {
		int i = 0, j = tab.length - 1;

		for (; i < (tab.length / 2);) {
			if (tab[i] != tab[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static boolean motPalindrome(String mot) {

		mot.toLowerCase();

		int i = 0, j = mot.length() - 1;

		for (; i < (mot.length() / 2);) {
			if (mot.charAt(i) != mot.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}