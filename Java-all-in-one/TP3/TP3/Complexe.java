package TP3;

public class Complexe {
    private int partieReelle;
    private int partieImaginaire;

    public Complexe() {
    }

    public Complexe(int partieReelle, int partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }

    public Complexe(Complexe complexe) {
        this.partieReelle = complexe.partieReelle;
        this.partieImaginaire = complexe.partieImaginaire;
    }

    public int getPartieReelle() {
        return partieReelle;
    }

    public void setPartieReelle(int partieReelle) {
        this.partieReelle = partieReelle;
    }

    public int getPartieImaginaire() {
        return partieImaginaire;
    }

    public void setPartieImaginaire(int partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }

    public void ajouter(Complexe complexe) {
        this.partieReelle += complexe.getPartieReelle();
        this.partieImaginaire += complexe.getPartieImaginaire();
    }

    public void soustraire(Complexe complexe) {
        this.partieReelle -= complexe.getPartieReelle();
        this.partieImaginaire -= complexe.getPartieImaginaire();
    }

    public String toString() {
        return this.partieReelle + " + " + this.partieImaginaire + "*i";
    }
}
