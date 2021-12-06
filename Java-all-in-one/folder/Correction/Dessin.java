public class Dessin {
    private int largeur;
    private int hauteur;

    public Dessin(int largeur, int hauteur) {
        setLargeur(largeur);
        setHauteur(hauteur);
    }

    public void rectanglePlein() {
        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public void rectangleCreux() {
        for (int i = 0; i < this.hauteur; i++) {
            for (int j = 0; j < this.largeur; j++)
                if (i == 0 || i == this.hauteur - 1)
                    System.out.print("*");
                else {
                    if (j == 0 || j == this.largeur - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.println("");
        }
    }

    public void triangleIsocele(int nombreLignes) {
        for (int i = 0; i < nombreLignes; i++) {
            for (int j = 0; j < (nombreLignes - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j < ((i + 1) * 2 - 1); j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public static void main(String[] args) {
        Dessin dessin = new Dessin(15, 4);

        dessin.rectanglePlein();
        System.out.println("\n");
        dessin.rectangleCreux();
        System.out.println("\n");
        dessin.triangleIsocele(5);
    }
}