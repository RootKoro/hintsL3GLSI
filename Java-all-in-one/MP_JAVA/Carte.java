package MP_JAVA;

public class Carte{
    private int signe;
    private String nom;
    private int valeur;

    public void setSigne(int signe){
        if(signe==0){
            this.signe = signe;
        }
        if(signe==1){
            this.signe = signe;
        }
        if(signe==2){
            this.signe = signe;
        }
        if(signe==3){
            this.signe = signe;
        }
    }
    public void setNom(String nom){
        if(nom.equals("0")|| nom.equals("1")|| nom.equals("2")|| nom.equals("3")|| nom.equals("4")|| nom.equals("5")|| nom.equals("6")|| nom.equals("7")|| nom.equals("8")|| nom.equals("9")|| nom.equals("10")|| nom.equals("roi")|| nom.equals("dame")|| nom.equals("valet"))
        {
            this.nom= nom;
        }
        else{
            this.nom=null;
        }
    }
    public void setValeur(int valeur){
        if(signe >=1 || signe <=13)
        {
            this.valeur= valeur;
        }
        else
        {
            this.valeur =0;
        }
    }
    public int getSigne(){
       return signe;
    }
    public String getNom(){
        return nom;
    }
    public int getValeur(){
        return valeur;
    }
    public Carte(int signe, String nom, int valeur){
        this.signe=signe;
        this.nom=nom;
        this.valeur=valeur;
    }
    public Carte(){}
    public void printOut(){
        System.out.println(nom+" "+" "+signe+" "+valeur);
    }
}