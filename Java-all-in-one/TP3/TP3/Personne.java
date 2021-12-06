package TP3;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private Sexe sexe;

    public Personne() {
        this.nom = "inconnu";
        this.prenom = "inconnu";
        this.sexe = Sexe.inconnu;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = Sexe.inconnu;
    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.setAge(age);
        this.sexe = Sexe.inconnu;
    }

    public Personne(String nom, String prenom, int age, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.setAge(age);
        this.setSexe(sexe);
    }

    public Personne(Personne personne) {
        this.nom = personne.nom;
        this.prenom = personne.prenom;
        this.age = personne.age;
        this.sexe = personne.sexe;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 130) ? age : 0;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = (sexe.equals(Sexe.masculin) || sexe.equals(Sexe.feminin)) ? sexe : Sexe.inconnu;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    public Sexe getSexe() {
        return this.sexe;
    }

    public String toString() {
        if (this.nom.contentEquals("inconnu") && this.prenom.contentEquals("inconnu") && this.age == 0
                && this.sexe.equals(Sexe.inconnu))
            return "Inconnu";
        else if (this.nom.contentEquals("inconnu") && this.prenom.contentEquals("inconnu") && this.age == 0)
            return "Inconnu de sexe " + this.sexe;
        else if (this.nom.contentEquals("inconnu") && this.prenom.contentEquals("inconnu")
                && this.sexe.equals(Sexe.inconnu))
            return "Inconnu de " + this.age + " ans";
        else if (this.nom.contentEquals("inconnu") && this.prenom.contentEquals("inconnu"))
            return "Inconnu de " + this.age + " ans et de sexe " + this.sexe;
        else if (this.nom.contentEquals("inconnu") && this.age == 0 && this.sexe.equals(Sexe.inconnu))
            return this.prenom;
        else if (this.nom.contentEquals("inconnu") && this.sexe.equals(Sexe.inconnu))
            return this.prenom + "; age : " + this.age;
        else if (this.nom.contentEquals("inconnu") && this.age == 0)
            return this.prenom + " de sexe + " + this.sexe;
        else if (this.nom.contentEquals("inconnu"))
            return this.prenom + "; age : " + this.age + " ; sexe : " + this.sexe;
        else if (this.prenom.contentEquals("inconnu") && this.age == 0 && this.sexe.equals(Sexe.inconnu))
            return this.nom;
        else if (this.prenom.contentEquals("inconnu") && this.sexe.equals(Sexe.inconnu))
            return this.nom + "; age : " + this.age;
        else if (this.prenom.contentEquals("inconnu") && this.age == 0)
            return this.nom + " de sexe + " + this.sexe;
        else if (this.prenom.contentEquals("inconnu"))
            return this.nom + "; age : " + this.age + " ; sexe : " + this.sexe;
        else
            return this.nom + " " + this.prenom + "; age : " + this.age + " ; sexe : " + this.sexe;
    }
}