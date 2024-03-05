public class CompteCourant extends CompteBancaire {
    public CompteCourant(int numCompte, double solde, String nom) {
        super(numCompte, solde, nom);
    }

    public CompteCourant() {
        super();
    }

    @Override
    public void deposer(double mtDepose) {
        super.deposer(mtDepose);
    }

    @Override
    public void retirer(double mtRetirer) {
        super.retirer(mtRetirer);
        double solde1 = solde;
        solde-=mtRetirer;
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
