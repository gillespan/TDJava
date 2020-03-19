public class TDJava {

    public static void main (String[] args) {
        Enfant charlotte = new Enfant("Charlotte", "Java");
        charlotte.sePresenter();
        Enfant olivier = new Enfant("Olivier", "Java");
        olivier.sePresenter();

// JOUER BALLON
        charlotte.jouerAuBallon(olivier);
// AMOUREUX
        charlotte.tomberAmoureux(olivier);
        olivier.tomberAmoureux(charlotte);
        if (charlotte.estAmoureux() != null) {
            System.out.println(charlotte.prenom + " est amoureux de " + charlotte.estAmoureux().prenom);
        }

        if (olivier.estAmoureux() != null) {
            System.out.println(olivier.prenom + " est amoureux de " + olivier.estAmoureux().prenom);
        }
        else {
            System.out.println(olivier.prenom + " n'est pas amoureux ");

        }


    }

}
