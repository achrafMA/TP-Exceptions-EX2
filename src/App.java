public class App {
    public static void main(String[] args) {
        CompteBancaire c=new CompteBancaire(1111,3000,"mohammed");
        /*c.retirer(2000);
        c.retirer(2000);*/
        c.affichage();
        CompteCourant c3=new CompteCourant(222,5000,"yassine");
        //c3.retirer(6000);
        c3.affichage();
        /*CompteEpargne c4=new CompteEpargne(6666,10000,"Hassan",0.04);
        c4.epargner();
        c4.affichage();*/
        c.transfer(c,c3,400);
        c.affichage();
        c3.affichage();
    }
}
