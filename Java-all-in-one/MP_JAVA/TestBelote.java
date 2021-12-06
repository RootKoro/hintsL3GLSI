package MP_JAVA;

public class TestBelote {

    public static void main(String[] args) {
        Belote belote = new Belote();
        int k = 0;
        while (true) {
            Carte carteRef = new Carte();
            carteRef = belote.joueur[0].jouerEnPremier();
            carteRef.printOut();
            for (int i = 1; i < 4; i++)
                belote.joueur[i].play(carteRef.getSigne()).printOut();
            k++;
            if (k == 13)
                break;
        }
    }
}