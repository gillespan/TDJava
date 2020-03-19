public class Train extends Vehicule {
    public Train() {
        super(100);
    }

    @Override
    public String toString() {
        return super.toString() + " TchooTchoo !";
    }
}