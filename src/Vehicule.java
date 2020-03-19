import java.util.Objects;

public class Vehicule {
    int nbRoues;

    public Vehicule(int nbRoues) {
        this.nbRoues = nbRoues;
    }



    @Override
    public String toString() {
        return "Je suis un véhicule a " + Integer.toString(nbRoues) + " roues";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return nbRoues == vehicule.nbRoues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbRoues);
    }
}
