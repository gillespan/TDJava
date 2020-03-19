import java.util.Comparator;

public class Voyageur implements Comparable<Voyageur> {
    private int idVoyageur;
    private  int numSiege;
    private String nomVoyageur;
    private Classe classeVoyageur;

    public Voyageur(int idVoyageur, int numSiege, String nomVoyageur, Classe classeVoyageur) {
        this.idVoyageur = idVoyageur;
        this.numSiege = numSiege;
        this.nomVoyageur = nomVoyageur;
        this.classeVoyageur = classeVoyageur;
    }

    public int getIdVoyageur() {
        return idVoyageur;
    }

    public int getNumSiege() {
        return numSiege;
    }

    public String getNomVoyageur() {
        return nomVoyageur;
    }

    public Classe getClasseVoyageur() {
        return classeVoyageur;
    }

    @Override
    public int compareTo(Voyageur voyageur) {
        if (this.classeVoyageur.ordinal() < voyageur.getClasseVoyageur().ordinal()) {
            return -1;
        } else {
            if (this.classeVoyageur.ordinal() == voyageur.getClasseVoyageur().ordinal()) {
                if (this.numSiege < voyageur.getNumSiege()) {
                    return -1;
                } else {
                    return 1;
                }
            } else
            return 1;
        }
    }
}
