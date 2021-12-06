package MP1;

public class Carte {
    private String signe;
    private String nom;
    private int valeur;

    public Carte() {
    }

    public Carte(Carte carte) {
        this.nom = carte.nom;
        this.signe = carte.signe;
        this.valeur = carte.valeur;
    }

    public Carte(int signe, String nom, int valeur) {
        setNom(nom);
        setSigne(signe);
        setValeur(valeur);
    }

    public void setNom(String nom) {
        if (nom.contentEquals("1") || nom.contentEquals("2") || nom.contentEquals("3") || nom.contentEquals("4")
                || nom.contentEquals("5") || nom.contentEquals("6") || nom.contentEquals("7") || nom.contentEquals("8")
                || nom.contentEquals("9") || nom.contentEquals("10") || nom.contentEquals("roi")
                || nom.contentEquals("reine") || nom.contentEquals("valet"))
            this.nom = nom;
        else
            this.nom = null;
    }

    public void setSigne(int signe) {
        if (signe == 1)
            this.signe = "trefle";
        else if (signe == 2)
            this.signe = "pique";
        else if (signe == 3)
            this.signe = "coeur";
        else if (signe == 4)
            this.signe = "carreau";
        else
            this.signe = null;
    }

    public void setValeur() {
        if (this.nom.contentEquals("1"))
            this.valeur = 1;
        else if (this.nom.contentEquals("2"))
            this.valeur = 2;
        else if (this.nom.contentEquals("3"))
            this.valeur = 3;
        else if (this.nom.contentEquals("4"))
            this.valeur = 4;
        else if (this.nom.contentEquals("5"))
            this.valeur = 5;
        else if (this.nom.contentEquals("6"))
            this.valeur = 6;
        else if (this.nom.contentEquals("7"))
            this.valeur = 7;
        else if (this.nom.contentEquals("8"))
            this.valeur = 8;
        else if (this.nom.contentEquals("9"))
            this.valeur = 9;
        else if (this.nom.contentEquals("10"))
            this.valeur = 10;
        else if (this.nom.contentEquals("valet"))
            this.valeur = 11;
        else if (this.nom.contentEquals("reine"))
            this.valeur = 12;
        else if (this.nom.contentEquals("roi"))
            this.valeur = 13;
        else
            this.valeur = 0;
    }

    public void setValeur(int valeur) {
        int nomValue;
        if (this.nom.contentEquals("1"))
            nomValue = 1;
        else if (this.nom.contentEquals("2"))
            nomValue = 2;
        else if (this.nom.contentEquals("3"))
            nomValue = 3;
        else if (this.nom.contentEquals("4"))
            nomValue = 4;
        else if (this.nom.contentEquals("5"))
            nomValue = 5;
        else if (this.nom.contentEquals("6"))
            nomValue = 6;
        else if (this.nom.contentEquals("7"))
            nomValue = 7;
        else if (this.nom.contentEquals("8"))
            nomValue = 8;
        else if (this.nom.contentEquals("9"))
            nomValue = 9;
        else if (this.nom.contentEquals("10"))
            nomValue = 10;
        else if (this.nom.contentEquals("valet"))
            nomValue = 11;
        else if (this.nom.contentEquals("reine"))
            nomValue = 12;
        else if (this.nom.contentEquals("roi"))
            nomValue = 13;
        else
            nomValue = 0;
        if (valeur < 14 && valeur > 0)
            if (nomValue == valeur)
                this.valeur = valeur;
            else
                this.valeur = 0;
        else
            this.valeur = 0;
    }

    public int getSigne() {
        if (this.signe.contentEquals("trefle"))
            return 1;
        else if (this.signe.contentEquals("pique"))
            return 2;
        else if (this.signe.contentEquals("coeur"))
            return 3;
        else if (this.signe.contentEquals("carreau"))
            return 4;
        return 0;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void printOut() {
        System.out.println(this.nom + " de " + this.signe + " (valeur : " + this.valeur + ")");
    }
}