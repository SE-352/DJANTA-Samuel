package TP1;
public class Application {
    public static void main(String[] args) throws Exception {
        Joueur joueur1 = new Joueur("DJANTA", "Samuel", "DJAS020800", 8);
        Joueur joueur2 = new Joueur("KPAKA", "Brice", "KPA020800", 5);

        JoueurJDBC jjdc = new JoueurJDBC();

        jjdc.add(joueur1);
        jjdc.add(joueur2);

        jjdc.findAll();
    }
}
