
public class Enfant {
    String nom;
    String prenom;
    int age = 0;

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    Enfant amoureux;


    Enfant(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    void sePresenter() {
        System.out.println("Bonjour Je m'appelle " + prenom + " " + nom + " j'ai " + age + " ans");
    }

    void feterAnniversaire() {
        if (age < 18) {
            ++age;
            return;
        } else {
            System.out.println("Vous avez deja 17 ans");
        }
    }

    public String getPrenom() {
        return prenom;
    }

    void jouerAuBallon(Enfant enf) {
        System.out.println(this.prenom + " joue au ballon avec " + enf.getPrenom());
    }

    void tomberAmoureux(Enfant enf) {
        amoureux = enf;
    }

    Enfant estAmoureux() {
        return amoureux;

    }
}

