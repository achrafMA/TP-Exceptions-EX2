public class CompteBancaire {
    private int numCompte;
    double solde;
    private String nom;

    public CompteBancaire(int numCompte, double solde, String nom) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nom = nom;
    }

    public CompteBancaire() {
    }
    public void deposer(double mtDepose){
        solde+=mtDepose;
    }
    public void retirer(double mtRetirer){
        try {
            if (mtRetirer>solde) throw new FondsInsuffisantsException("Solde insuffisant");
            solde-=mtRetirer;
        }catch (FondsInsuffisantsException e){
            System.out.println(e.getMessage());
        }
    }
    public void affichage(){
        System.out.print("****Nom & Prenom : "+nom);
        System.out.print(" **** Numero de compte : "+numCompte);
        System.out.print(" **** Votre solde : "+solde);
    }
    public void transfer(CompteBancaire c1,CompteBancaire c2,double mtTransfree){
        try {
            if (mtTransfree>c1.solde)throw new FondsInsuffisantsException("Solde insuffisant");
            c1.solde-=mtTransfree;
            c2.solde+=mtTransfree;
        }catch (FondsInsuffisantsException e){
            System.out.println(e.getMessage());
        }

        /*try {
            if (c2.numCompte = (null))throw new CompteInexistantException("Compte inexistant");
            c2.solde+=mtTransfree;
        }catch (CompteInexistantException e){
            System.out.println(e.getMessage());
        }*/

    }
}
