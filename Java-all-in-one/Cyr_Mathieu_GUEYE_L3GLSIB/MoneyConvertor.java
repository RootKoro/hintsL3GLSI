public class MoneyConvertor {
    private double montant;
    private double tauxConversion = 655.957;

    public MoneyConvertor() {
    };

    public MoneyConvertor(double montant) {
        this.setMontant(montant);
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public double toEuro() {
        return this.montant / tauxConversion;
    }

    public double toCfa() {
        return this.montant * tauxConversion;
    }
}