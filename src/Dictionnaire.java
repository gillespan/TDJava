public class  Dictionnaire {
    public final static String NOM = "Larousse";
    private static boolean estOuvert = false;
    static public Dictionnaire mondico;

    private Dictionnaire() {

    }

    public static Dictionnaire getInstance() {
        if (estOuvert == true) {
            return mondico;
        }
        else {
            mondico = new Dictionnaire();
            estOuvert = true;
            return mondico;
        }
    }

}
