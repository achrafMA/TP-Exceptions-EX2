public class CompteEpargne extends CompteBancaire {
    private final double tauxInterets;

    public CompteEpargne(int numCompte, double solde, String nom, double tauxInterets) {
        super(numCompte, solde, nom);
        this.tauxInterets=tauxInterets;
    }

    public CompteEpargne(double tauxInterets) {
        super();

        this.tauxInterets = tauxInterets;
    }

    public void epargner(){
        solde+=solde*tauxInterets;
    }
    @Override
    public void deposer(double mtDepose) {
        super.deposer(mtDepose);
    }

    @Override
    public void retirer(double mtRetirer) {
        super.retirer(mtRetirer);
    }

    @Override
    public void affichage() {
        super.affichage();
    }

    @Override
    public void transfer(CompteBancaire c1, CompteBancaire c2, double mtTransfree) {
        super.transfer(c1, c2, mtTransfree);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
