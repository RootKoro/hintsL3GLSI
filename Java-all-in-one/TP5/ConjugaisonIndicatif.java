import java.util.Scanner;

public class ConjugaisonIndicatif {
    private String verbe;
    private static String verbeAConjuguer = "";
    private String[] pronoms = { "je", "tu", "il", "nous", "vous", "elles" };
    private String[] terminaisonPresent = { "e", "es", "e", "ons", "ez", "ent" };
    private String[] terminaisonPasse = { "ai", "as", "a", "ames", "ates", "erent" };
    private String[] terminaisonFutur = { "ai", "as", "a", "ons", "ez", "ont" };
    private String[] terminaisonImparfait = { "ais", "ais", "ait", "ions", "iez", "aient" };

    ConjugaisonIndicatif(String verbe) {
        this.verbe = (verbe.charAt(verbe.length() - 2) == 'e' && verbe.charAt(verbe.length() - 1) == 'r')
                ? verbe.toLowerCase()
                : null;
        if (this.verbe == null)
            System.out.println("Les verbes du premier groupe se terminent par \"er\"");
    }

    public String getVerbe() {
        return (this.verbe == null) ? "Pas encore de verbe" : this.verbe;
    }

    public void setVerbe(String verbe) {
        this.verbe = ((verbe.charAt(verbe.length() - 2) == 'e' && verbe.charAt(verbe.length() - 1) == 'r')
                || verbe.contentEquals("aller")) ? verbe.toLowerCase() : null;
    }

    private void initVerbe() {
        for (int i = 0; i < this.verbe.length() - 2; i++)
            verbeAConjuguer += this.verbe.charAt(i);
    }

    public void present() {
        if (this.verbe == null)
            return;
        else if (verbeAConjuguer.contentEquals(""))
            initVerbe();
        for (int i = 0; i < 6; i++)
            System.out.println(pronoms[i] + "\t" + verbeAConjuguer + "" + terminaisonPresent[i]);
    }

    public void passe() {
        if (this.verbe == null)
            return;
        else if (verbeAConjuguer.contentEquals(""))
            initVerbe();
        for (int i = 0; i < 6; i++)
            System.out.println(pronoms[i] + "\t" + verbeAConjuguer + "" + terminaisonPasse[i]);
    }

    public void futur() {
        if (this.verbe == null)
            return;
        else
            for (int i = 0; i < 6; i++)
                System.out.println(pronoms[i] + "\t" + verbe + "" + terminaisonFutur[i]);
    }

    public void imparfait() {
        if (this.verbe == null)
            return;
        else if (verbeAConjuguer.contentEquals(""))
            initVerbe();
        for (int i = 0; i < 6; i++)
            System.out.println(pronoms[i] + "\t" + verbeAConjuguer + "" + terminaisonImparfait[i]);
    }
}
