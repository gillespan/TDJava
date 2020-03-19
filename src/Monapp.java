import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Monapp {
    public static void main(String[] args) {
        ArrayList<Character> machaine = new ArrayList<>();

        machaine.add('z');
        machaine.add('d');
        machaine.add('c');
        machaine.add('e');

        System.out.println(machaine);

        Collections.sort(machaine);

        System.out.println(machaine);

// List trié
        TreeSet<Character> machaine2 = new TreeSet<>();

        machaine2.add('z');
        machaine2.add('d');
        machaine2.add('c');
        machaine2.add('e');


        for (char c : machaine2) {
            System.out.print(c);
        }


    }
}