public class GestionStock {
    private Produit[] produits;
    private int nombreProduits;

    public GestionStock(int maxStock) {
        this.produits = new Produit[maxStock];
        nombreProduits = 0;
    }

    public void ajouterProduit(Produit p) {
        if (this.nombreProduits < this.produits.length) {
            produits[nombreProduits] = p;
            nombreProduits++;
        }
    }

    public void supprimerProduit(Produit p) {
        for (int i = 0; i < this.nombreProduits; i++) {
            if (p.equals(produits[i])) {
                produits[i] = null;
                nombreProduits--;
            }
        }
    }
}
