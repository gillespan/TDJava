public class Main {
    public static void main(String[] args) {
        String str = "aaaa";
        String strMaj = str.toUpperCase();
        System.out.println(strMaj);
        // Compter lettre
        String phrase = "il y a 5 a dans la phrase";
        int nb = 0;
        for (int i = 0; i < phrase.length() ; i++) {
            if (phrase.charAt(i) == 'a') {
                nb++;
            }
        }
        System.out.print("Nb de a = ");
        System.out.println(nb);
// --- REPLACE-----//
        System.out.println(monReplace(phrase));
// -------------
        String phrase2 = "abcdefghijklmnop";
        System.out.println(monSup(phrase2));

        nb = 5;
        String strInt = String.valueOf(nb);
        System.out.println(strInt);

        String stringnb = "5";
        int nbString  = Integer.parseInt(stringnb);
        System.out.println(nbString);

    }
    public static String monReplace (String s) {
        return s.replace("a","4");
    }
    public static String monSup (String s) {
        String newString = s.substring(0,4) + s.substring(10);
        return newString;
    }

}
