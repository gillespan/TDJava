import java.util.ArrayList;

public class MonApp2 {
    public static void main(String[] args) {
        ArrayList<Voyageur> voyageur = new ArrayList<>();
        voyageur.add(new Voyageur(1,20,"Martin",Classe.ECO));
        voyageur.add(new Voyageur(2,10,"Dupond",Classe.PREMIERE));

        voyageur.add(new Voyageur(2,3,"Dupond2",Classe.PREMIERE));
        voyageur.add(new Voyageur(2,5,"Dupond3",Classe.BUSINESS));

        for (int i = 0; i < voyageur.size(); i++) {
            System.out.println(voyageur.get(i).getNomVoyageur() + " " + voyageur.get(i).getClasseVoyageur());
        }

        voyageur.sort(Voyageur::compareTo);
        for (int i = 0; i < voyageur.size(); i++) {
            System.out.println(voyageur.get(i).getNomVoyageur() + " " + voyageur.get(i).getClasseVoyageur());
        }
        



    }
}
